package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoreSpicyTest {
    private MoreSpicy moreSpicy = new MoreSpicy();

    @Test
    void case1() {
        assertEquals(2, moreSpicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    @Test
    void case2() {
        assertEquals(-1, moreSpicy.solution(new int[]{12, 21, 3, 9, 10, 12}, 3000));
    }
}