package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockExamTest {
    private MockExam mockExam = new MockExam();

    @Test
    void case1() {
        assertArrayEquals(new int[]{1}, mockExam.solution(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{1, 2, 3}, mockExam.solution(new int[]{1, 3, 2, 4, 2}));
    }

}