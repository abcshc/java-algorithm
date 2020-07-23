package com.example.javaalgorithm.programmers;

import java.util.Arrays;

public class BudgetCeiling {
    public int solution(int[] budgets, int M) {
        Arrays.sort(budgets);

        if (Arrays.stream(budgets).mapToLong(it -> (long) it).sum() <= M) {
            return Arrays.stream(budgets).max().orElse(0);
        }

        int pivot = M / budgets.length;

        long total = 0;

        for (int i = 0; i < budgets.length; i++) {
            if (pivot >= budgets[i]) {
                total += budgets[i];
            } else {
                pivot = (int) (M - total) / (budgets.length - i);
                if (pivot >= budgets[i]) {
                    total += budgets[i];
                } else {
                    return pivot;
                }
            }
        }

        return pivot;
    }
}
