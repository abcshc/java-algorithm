package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreAfterSplittingAStringTest {
    MaximumScoreAfterSplittingAString maximumScoreAfterSplittingAString = new MaximumScoreAfterSplittingAString();

    @Test
    void case1() {
        assertEquals(1, maximumScoreAfterSplittingAString.maxScore("00"));
    }

    @Test
    void case2() {
        assertEquals(5, maximumScoreAfterSplittingAString.maxScore("1011011"));
    }


    @Test
    void case3() {
        assertEquals(5, maximumScoreAfterSplittingAString.maxScore("011101"));
    }
}