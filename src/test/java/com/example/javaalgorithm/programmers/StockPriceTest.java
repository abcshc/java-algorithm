package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StockPriceTest {
    private StockPrice stockPrice = new StockPrice();

    @Test
    void case1() {
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, stockPrice.solution(new int[]{1, 2, 3, 2, 3}));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{1, 1, 1, 3, 2, 1, 0}, stockPrice.solution(new int[]{5, 4, 2, 1, 3, 4, 5}));
    }
}