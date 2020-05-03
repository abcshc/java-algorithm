package com.example.javaalgorithm.programmers;

import java.util.Arrays;

public class Scale {
    public int solution(int[] weight) {
        Arrays.sort(weight);
        int answer = 0;
        if (weight[0] > 1) {
            return 1;
        }

        for (int w : weight) {
            if (w != 1 && w - 1 > answer) {
                return answer + 1;
            } else {
                answer += w;
            }
        }

        return answer + 1;
    }
}
