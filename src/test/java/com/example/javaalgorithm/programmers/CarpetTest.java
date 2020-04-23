package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {
    private Carpet carpet = new Carpet();

    @Test
    void case1() {
        assertArrayEquals(new int[]{4, 3}, carpet.solution(10, 2));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{3, 3}, carpet.solution(8, 1));
    }

    @Test
    void case3() {
        assertArrayEquals(new int[]{8, 6}, carpet.solution(24, 24));
    }
}