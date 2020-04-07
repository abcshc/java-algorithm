package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.LinkedList;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Task> tasks = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            tasks.offer(new Task(progresses[i], speeds[i]));
        }

        ArrayList<Integer> answer = new ArrayList<>();
        while (!tasks.isEmpty()) {
            Task task = tasks.poll();
            int next = task.checkDaysToComplete();
            int count = 1;
            while (!tasks.isEmpty() && tasks.getFirst().checkDaysToComplete() <= next) {
                tasks.poll();
                count++;
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private class Task {
        int progress;
        int speed;

        Task(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        int checkDaysToComplete() {
            return (int) Math.ceil((100 - progress) / speed);
        }
    }
}
