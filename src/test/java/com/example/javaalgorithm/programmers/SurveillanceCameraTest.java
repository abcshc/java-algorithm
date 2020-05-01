package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurveillanceCameraTest {
    SurveillanceCamera surveillanceCamera = new SurveillanceCamera();

    @Test
    void case1() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}}));
    }

    @Test
    void case2() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{0, 0}, {0, 0}, {2, 2}}));
    }

    @Test
    void case3() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{0, 1}, {0, 1}, {2, 2}}));
    }

    @Test
    void case4() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{-2, -1}, {1, 2}, {-3, 0}}));
    }

    @Test
    void case5() {
        assertEquals(1, surveillanceCamera.solution(new int[][]{{0, 0}}));
    }

    @Test
    void case6() {
        assertEquals(1, surveillanceCamera.solution(new int[][]{{0, 1}, {0, 1}, {1, 2}}));
    }

    @Test
    void case7() {
        assertEquals(4, surveillanceCamera.solution(new int[][]{{0, 1}, {2, 3}, {4, 5}, {6, 7}}));
    }

    @Test
    void case8() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}}));
    }

    @Test
    void case9() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}}));
    }

    @Test
    void case10() {
        assertEquals(2, surveillanceCamera.solution(new int[][]{{-20, 15}, {-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}}));
    }
}