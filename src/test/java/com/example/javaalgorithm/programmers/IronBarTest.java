package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IronBarTest {
    private IronBar ironBar = new IronBar();

    @Test
    void case1() {
        assertEquals(17, ironBar.solution("()(((()())(())()))(())"));
    }
}