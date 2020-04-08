package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiskControllerTest {
    private DiskController diskController = new DiskController();

    @Test
    void case1() {
        assertEquals(9, diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }


    @Test
    void case2() {
        assertEquals(74, diskController.solution(new int[][]{{24, 10}, {18, 39}, {34, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}}));
    }
}