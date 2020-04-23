package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberBaseballTest {
    NumberBaseball numberBaseball = new NumberBaseball();

    @Test
    void case1() {
        assertEquals(2, numberBaseball.solution(new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}}));
    }


    @Test
    void case2() {
        assertEquals(1, numberBaseball.solution(new int[][]{{123, 1, 2}, {937, 1, 0}}));
    }
}