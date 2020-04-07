package com.example.javaalgorithm.programmers;

import java.util.PriorityQueue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> foods = new PriorityQueue<>();
        for (int value : scoville) {
            foods.offer(value);
        }
        int answer = 0;
        while (!foods.isEmpty()) {
            int current = foods.poll();
            if (current >= K) {
                return answer;
            }

            if (!foods.isEmpty()) {
                int next = foods.poll();
                int mixed = current + next * 2;
                foods.offer(mixed);
                answer++;
            }
        }
        return -1;
    }
}
