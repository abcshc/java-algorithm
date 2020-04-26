package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeboatTest {
    private Lifeboat lifeboat = new Lifeboat();

    @Test
    void case1() {
        assertEquals(3, lifeboat.solution(new int[]{70, 50, 80, 50}, 100));
    }

    @Test
    void case2() {
        assertEquals(3, lifeboat.solution(new int[]{70, 80, 50}, 100));
    }

    @Test
    void case3() {
        assertEquals(2, lifeboat.solution(new int[]{40, 40, 80}, 160));
    }

    @Test
    void case4() {
        assertEquals(4, lifeboat.solution(new int[]{60, 70, 80, 90}, 100));
    }

    @Test
    void case5() {
        assertEquals(6, lifeboat.solution(new int[]{10, 30, 80, 60, 20, 30, 40, 55, 50, 100}, 100));
    }

    @Test
    void case6() {
        assertEquals(2, lifeboat.solution(new int[]{50, 50, 50, 50}, 100));
    }
}