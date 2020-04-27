package com.example.javaalgorithm.leetcode;

import java.util.Arrays;

public class MaximumPointsObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        if (k == cardPoints.length) {
            return Arrays.stream(cardPoints).sum();
        }
        if (k == 1) {
            return Math.max(cardPoints[0], cardPoints[cardPoints.length - 1]);
        }

        int[] first = new int[k];
        first[0] = cardPoints[0];
        int[] last = new int[k];
        last[0] = cardPoints[cardPoints.length - 1];

        for (int i = 1; i < k; i++) {
            first[i] = cardPoints[i] + first[i - 1];
            last[i] = cardPoints[cardPoints.length - 1 - i] + last[i - 1];
        }

        int max = Math.max(first[k - 1], last[k - 1]);
        for (int fi = 0; fi < k; fi++) {
            int li = k - fi - 2;
            if (li < 0) {
                break;
            }
            if (max < first[fi] + last[li]) {
                max = first[fi] + last[li];
            }
        }

        return max;
    }
}
