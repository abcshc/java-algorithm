package com.example.javaalgorithm.programmers;

public class Carpet {
    public int[] solution(int brown, int red) {
        int wh = brown / 2 + 2;
        int minW = (int) Math.ceil(wh / 2);
        for (int i = minW; wh - i >= 0; i++) {
            if (i * (wh - i) == brown + red) {
                if (i < wh - i) {
                    return new int[]{wh - i, i};
                }
                return new int[]{i, wh - i};
            }
        }
        return new int[]{0, 0};
    }
}
