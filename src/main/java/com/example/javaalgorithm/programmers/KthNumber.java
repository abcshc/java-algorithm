package com.example.javaalgorithm.programmers;

import java.util.ArrayList;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            ArrayList<Integer> currentArray = new ArrayList<>();
            for (int j = command[0] - 1; j < command[1]; j++) {
                currentArray.add(array[j]);
            }
            currentArray.sort(Integer::compareTo);
            answer[i] = currentArray.get(command[2] - 1);
        }

        return answer;
    }
}
