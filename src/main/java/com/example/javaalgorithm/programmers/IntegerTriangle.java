package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        even.add(triangle[0][0]);
        odd.add(even.get(0) + triangle[1][0]);
        odd.add(even.get(0) + triangle[1][1]);

        for (int i = 2; i < triangle.length; i++) {
            int[] line = triangle[i];
            if (i % 2 == 0) {
                add(even, odd, line);
            } else {
                add(odd, even, line);
            }
        }

        if (triangle.length % 2 == 0) {
            return Collections.max(odd);
        }
        return Collections.max(even);
    }

    private void add(ArrayList<Integer> current, ArrayList<Integer> before, int[] line) {
        for (int j = 0; j < line.length; j++) {
            if (j == 0) {
                current.set(0, before.get(0) + line[j]);
            } else if (j == line.length - 1) {
                current.add(before.get(j - 1) + line[j]);
            } else if (j == line.length - 2) {
                current.add(Math.max(before.get(j), before.get(j - 1)) + line[j]);
            } else {
                current.set(j, Math.max(before.get(j), before.get(j - 1)) + line[j]);
            }
        }
    }
}
