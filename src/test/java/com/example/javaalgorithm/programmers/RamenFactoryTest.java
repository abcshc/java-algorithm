package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RamenFactoryTest {
    private RamenFactory ramenFactory = new RamenFactory();

    @Test
    void case1() {
        assertEquals(2, ramenFactory.solution(4, new int[]{4, 10, 15}, new int[]{20, 5, 10}, 30));
    }
}