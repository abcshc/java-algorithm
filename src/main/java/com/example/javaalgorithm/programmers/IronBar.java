package com.example.javaalgorithm.programmers;

import java.util.LinkedList;

public class IronBar {
    public int solution(String arrangement) {
        LinkedList<Integer> bars = new LinkedList<>();
        int answer = 0;
        boolean endStack = false;
        for (char c : arrangement.toCharArray()) {
            if (c == '(') {
                bars.offer(1);
                endStack = false;
            } else if (c == ')') {
                bars.poll();
                if (endStack) {
                    answer++;
                } else {
                    if (!bars.isEmpty()) {
                        answer += bars.size();
                    }
                    endStack = true;
                }
            }
        }

        return answer;
    }
}