package com.example.javaalgorithm.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        PriorityQueue<Job> requestTimeQueue = new PriorityQueue<>(Comparator.comparing(Job::getRequestTime).thenComparing(Job::getProceedTime));
        PriorityQueue<Job> proceedTimeQueue = new PriorityQueue<>(Comparator.comparing(Job::getProceedTime));

        for (int i = 0; i < jobs.length; i++) {
            requestTimeQueue.offer(new Job(jobs[i][0], jobs[i][1]));
        }

        Job firstJob = requestTimeQueue.poll();
        int time = firstJob.requestTime + firstJob.proceedTime;
        int answer = firstJob.proceedTime;

        while (!requestTimeQueue.isEmpty() || !proceedTimeQueue.isEmpty()) {
            while (!requestTimeQueue.isEmpty() && requestTimeQueue.peek().requestTime <= time) {
                proceedTimeQueue.offer(requestTimeQueue.poll());
            }
            if(proceedTimeQueue.isEmpty() && !requestTimeQueue.isEmpty()) {
                proceedTimeQueue.offer(requestTimeQueue.poll());
            }

            Job nextJob = proceedTimeQueue.poll();
            if(nextJob.requestTime > time) {
                time = nextJob.requestTime;
            }
            time = time + nextJob.proceedTime;
            answer = answer + time - nextJob.requestTime;
        }

        return answer / jobs.length;
    }

    private class Job {
        int requestTime;
        int proceedTime;

        Job(int requestTime, int proceedTime) {
            this.requestTime = requestTime;
            this.proceedTime = proceedTime;
        }

        public int getRequestTime() {
            return requestTime;
        }

        public int getProceedTime() {
            return proceedTime;
        }
    }
}
