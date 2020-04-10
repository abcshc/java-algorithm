package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthNumberTest {
    KthNumber kthNumber = new KthNumber();

    @Test
    void case1() {
        assertArrayEquals(new int[]{5, 6, 3}, kthNumber.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}