package com.example.javaalgorithm.programmers;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            int seconds = 1;
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (prices[i] > prices[j]) {
                    break;
                } else {
                    seconds++;
                }
            }
            answer[i] = seconds;
        }

        answer[prices.length - 1] = 0;

        return answer;
    }
}