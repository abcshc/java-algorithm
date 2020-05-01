package com.example.javaalgorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class SurveillanceCamera {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(i -> i[1]));

        int answer = 0;
        int last = Integer.MIN_VALUE;

        for (int[] route : routes) {
            if(route[0] > last) {
                answer++;
                last = route[1];
            }
        }

        return answer;
    }
}
