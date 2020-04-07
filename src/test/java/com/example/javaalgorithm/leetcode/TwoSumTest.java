package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private TwoSum twoSum = new TwoSum();

    @Test
    void case1() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void case3() {
        assertArrayEquals(new int[]{0, 3}, twoSum.twoSum(new int[]{0, 4, 3, 0}, 0));
    }
}