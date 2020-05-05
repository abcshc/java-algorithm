package com.example.javaalgorithm.programmers;

public class TileDecorations {
    public long solution(int N) {
        if (N == 1) {
            return 4;
        }
        long x = 1;
        long y = 2;

        for (int i = 2; i < N; i++) {
            if (i % 2 == 0) {
                x = x + y;
            } else {
                y = y + x;
            }

        }
        return x * 2 + y * 2;
    }
}