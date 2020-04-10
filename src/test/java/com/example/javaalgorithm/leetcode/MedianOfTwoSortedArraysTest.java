package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    void case1() {
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    void case2() {
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}