package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConnectingIslandsTest {
    ConnectingIslands connectingIslands = new ConnectingIslands();

    @Test
    void case1() {
        assertEquals(4, connectingIslands.solution(4, new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}}));
    }

    @Test
    void case2() {
        assertEquals(8, connectingIslands.solution(5, new int[][]{{0, 1, 1}, {3, 4, 1}, {1, 2, 2}, {2, 3, 4}}));
    }

    @Test
    void case3() {
        assertEquals(7, connectingIslands.solution(5, new int[][]{{0, 1, 1}, {3, 4, 1}, {0, 2, 2}, {1, 3, 3}, {1, 2, 5}, {2, 3, 8}}));
    }

    @Test
    void case4() {
        assertEquals(9, connectingIslands.solution(4, new int[][]{{3, 1, 2}, {1, 2, 3}, {2, 3, 3}, {3, 0, 4}, {0, 1, 5}}));
    }
}