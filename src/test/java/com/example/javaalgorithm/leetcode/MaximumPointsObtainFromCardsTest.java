package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPointsObtainFromCardsTest {
    MaximumPointsObtainFromCards maximumPointsObtainFromCards = new MaximumPointsObtainFromCards();

    @Test
    void case1() {
        assertEquals(12, maximumPointsObtainFromCards.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
    }

    @Test
    void case2() {
        assertEquals(4, maximumPointsObtainFromCards.maxScore(new int[]{2, 2, 2}, 2));
    }

    @Test
    void case3() {
        assertEquals(55, maximumPointsObtainFromCards.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7));
    }

    @Test
    void case4() {
        assertEquals(1, maximumPointsObtainFromCards.maxScore(new int[]{1, 1000, 1}, 1));
    }

    @Test
    void case5() {
        assertEquals(202, maximumPointsObtainFromCards.maxScore(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3));
    }

    @Test
    void case6() {
        assertEquals(204, maximumPointsObtainFromCards.maxScore(new int[]{3, 79, 80, 1, 1, 1, 200, 1}, 3));
    }
}