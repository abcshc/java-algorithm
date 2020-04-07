package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FunctionDevelopmentTest {
    private FunctionDevelopment functionDevelopment = new FunctionDevelopment();

    @Test
    void case1() {
        assertArrayEquals(new int[]{2, 1}, functionDevelopment.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }
}