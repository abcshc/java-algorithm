package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    LargestNumber largestNumber = new LargestNumber();

    @Test
    void case1() {
        assertEquals("9534330", largestNumber.solution(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    void case2() {
        assertEquals("6210", largestNumber.solution(new int[]{6, 10, 2}));
    }

    @Test
    void case3() {
        assertEquals("6540333332323001000", largestNumber.solution(new int[]{300, 40, 5, 32, 1000, 6, 333, 332}));
    }

    @Test
    void case4() {
        assertEquals("0", largestNumber.solution(new int[]{0, 0, 0, 0, 0}));
    }
}