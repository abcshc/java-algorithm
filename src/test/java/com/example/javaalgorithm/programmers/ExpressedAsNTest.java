package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressedAsNTest {
    ExpressedAsN expressedAsN = new ExpressedAsN();

    @Test
    void case1() {
        assertEquals(4, expressedAsN.solution(5, 12));
    }

    @Test
    void case2() {
        assertEquals(3, expressedAsN.solution(2, 11));
    }

    @Test
    void case3() {
        assertEquals(4, expressedAsN.solution(5, 111));
    }

    @Test
    void case4() {
        assertEquals(4, expressedAsN.solution(1, 13));
    }

    @Test
    void case5() {
        assertEquals(1, expressedAsN.solution(1, 1));
    }

    @Test
    void case6() {
        assertEquals(2, expressedAsN.solution(2, 22));
    }

    @Test
    void case7() {
        assertEquals(-1, expressedAsN.solution(5, 31168));
    }

    @Test
    void case8() {
        assertEquals(7, expressedAsN.solution(1, 1111111));
    }
}