package com.example.javaalgorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class ConnectingIslands {
    public int solution(int n, int[][] costs) {
        int[] group = new int[n];
        for (int i = 0; i < n; i++) {
            group[i] = i;
        }

        Arrays.sort(costs, Comparator.comparingInt(i -> i[2]));

        int answer = 0;
        for (int[] cost : costs) {
            int g0 = findGroup(group, cost[0]);
            int g1 = findGroup(group, cost[1]);
            if (g0 != g1) {
                if (g0 < g1) {
                    group[g1] = cost[0];
                } else {
                    group[g0] = cost[1];
                }
                answer += cost[2];
            }
        }

        return answer;
    }

    private int findGroup(int[] group, int i) {
        if (group[i] == i) {
            return i;
        } else {
            return findGroup(group, group[i]);
        }
    }
}
