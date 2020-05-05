package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerTriangleTest {
    IntegerTriangle integerTriangle = new IntegerTriangle();

    @Test
    void case1() {
        assertEquals(30, integerTriangle.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }

    @Test
    void case2() {
        assertEquals(25, integerTriangle.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}}));
    }
}