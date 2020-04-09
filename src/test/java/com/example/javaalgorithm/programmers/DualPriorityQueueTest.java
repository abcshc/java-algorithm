package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DualPriorityQueueTest {
    private DualPriorityQueue dualPriorityQueue = new DualPriorityQueue();

    @Test
    void case1() {
        assertArrayEquals(new int[]{0, 0}, dualPriorityQueue.solution(new String[]{"I 16", "D 1"}));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{7, 5}, dualPriorityQueue.solution(new String[]{"I 7", "I 5", "I -5", "D -1"}));
    }

    @Test
    void case3() {
        assertArrayEquals(new int[]{6, 5}, dualPriorityQueue.solution(new String[]{"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"}));
    }
}