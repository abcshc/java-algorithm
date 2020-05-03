package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaleTest {
    Scale scale = new Scale();

    @Test
    void case1() {
        assertEquals(21, scale.solution(new int[]{3, 1, 6, 2, 7, 30, 1}));
    }

    @Test
    void case2() {
        assertEquals(6, scale.solution(new int[]{1, 1, 3}));
    }
}