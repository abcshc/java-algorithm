package com.example.javaalgorithm.leetcode;

import java.util.stream.IntStream;

public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int current = (int) IntStream.range(1, chars.length).mapToObj(i -> chars[i]).filter(it -> it == '1').count();
        if (chars[0] == '0') {
            current++;
        }

        int max = current;
        for (int i = 1; i < s.length() - 1; i++) {
            if (chars[i] == '1') {
                current--;
            } else {
                current++;
            }
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
}
