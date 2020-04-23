package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {
    private GymSuit gymSuit = new GymSuit();

    @Test
    void case1() {
        assertEquals(5, gymSuit.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }

    @Test
    void case2() {
        assertEquals(4, gymSuit.solution(5, new int[]{2, 4}, new int[]{3}));
    }

    @Test
    void case3() {
        assertEquals(2, gymSuit.solution(3, new int[]{3}, new int[]{1}));
    }

    @Test
    void case4() {
        assertEquals(7, gymSuit.solution(8, new int[]{5, 6}, new int[]{4, 5}));
    }

    @Test
    void case5() {
        assertEquals(6, gymSuit.solution(8, new int[]{2, 3, 4}, new int[]{1}));
    }

    @Test
    void case6() {
        assertEquals(2, gymSuit.solution(3, new int[]{1, 2}, new int[]{2, 3}));
    }
}