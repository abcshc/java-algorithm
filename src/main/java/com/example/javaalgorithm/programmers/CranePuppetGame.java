package com.example.javaalgorithm.programmers;

import java.util.Stack;

public class CranePuppetGame {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (!basket.isEmpty() && basket.peek() == board[i][move - 1]) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
