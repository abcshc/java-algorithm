package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CranePuppetGameTest {
    private CranePuppetGame cranePuppetGame = new CranePuppetGame();

    @Test
    void case1() {
        assertEquals(4, cranePuppetGame.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }


    @Test
    void case2() {
        assertEquals(6, cranePuppetGame.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 3}, {0, 3, 0, 0, 3}, {4, 2, 0, 4, 2}, {3, 5, 0, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
}