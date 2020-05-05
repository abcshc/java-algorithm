package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TileDecorationsTest {
    TileDecorations tileDecorations = new TileDecorations();

    @Test
    void case1() {
        assertEquals(26, tileDecorations.solution(5));
    }

    @Test
    void case2() {
        assertEquals(42, tileDecorations.solution(6));
    }
}