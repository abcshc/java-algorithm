package com.example.javaalgorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HIndex {
    public int solution(int[] citations) {
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());
        int count = 0;
        int min = 10001;
        for (Integer citation : list) {
            if (citation <= count) {
                return count;
            }
            count++;
            if (citation < min) {
                min = citation;
            }

            if (count >= min) {
                return count;
            }
        }
        return count;
    }
}
