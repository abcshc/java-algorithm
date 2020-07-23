package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestSetTest {
    private BestSet bestSet = new BestSet();
    @Test
    void case1() {
        assertArrayEquals(bestSet.solution(2, 9), new int[]{4, 5});
    }

    @Test
    void case2() {
        assertArrayEquals(bestSet.solution(2, 1), new int[]{-1});
    }

    @Test
    void case3() {
        assertArrayEquals(bestSet.solution(2, 8), new int[]{4, 4});
    }

    @Test
    void case4() {
        assertArrayEquals(bestSet.solution(6, 300), new int[]{50, 50, 50, 50, 50, 50});
    }

    @Test
    void case5() {
        assertArrayEquals(bestSet.solution(1, 100000000), new int[]{100000000});
    }

    @Test
    void case6() {
        assertArrayEquals(bestSet.solution(2, 100000000), new int[]{50000000, 50000000});
    }
}