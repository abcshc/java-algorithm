package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    private HIndex hIndex = new HIndex();

    @Test
    void case1() {
        assertEquals(3, hIndex.solution(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    void case2() {
        assertEquals(2, hIndex.solution(new int[]{0, 1, 1, 5, 6}));
    }

    @Test
    void case3() {
        assertEquals(4, hIndex.solution(new int[]{5, 5, 5, 5}));
    }
}