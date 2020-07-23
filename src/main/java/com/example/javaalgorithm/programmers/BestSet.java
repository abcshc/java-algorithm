package com.example.javaalgorithm.programmers;

public class BestSet {
    public int[] solution(int n, int s) {
        if (s < n) {
            return new int[]{-1};
        }
        int baseNumber = s / n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = baseNumber;
        }
        int remains = s - (baseNumber * n);

        for (int i = 0; i < remains; i++) {
            result[n - 1 - i] += 1;
        }

        return result;
    }
}
