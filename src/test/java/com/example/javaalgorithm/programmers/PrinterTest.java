package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrinterTest {
    private Printer printer = new Printer();

    @Test
    void case1() {
        assertEquals(1, printer.solution(new int[]{2, 1, 3, 2}, 2));
    }

    @Test
    void case2() {
        assertEquals(5, printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}