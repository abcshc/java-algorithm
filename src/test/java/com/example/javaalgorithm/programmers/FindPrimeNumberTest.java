package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberTest {
    private FindPrimeNumber findPrimeNumber = new FindPrimeNumber();

    @Test
    void case1() {
        assertEquals(3, findPrimeNumber.solution("17"));
    }

    @Test
    void case2() {
        assertEquals(2, findPrimeNumber.solution("011"));
    }

    @Test
    void case3() {
        assertEquals(14, findPrimeNumber.solution("1234"));
    }

    @Test
    void case4() {
        assertEquals(12, findPrimeNumber.solution("7843"));
    }
}