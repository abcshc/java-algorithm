package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckOnBridgeTest {
    private TruckOnBridge truckOnBridge = new TruckOnBridge();

    @Test
    void case1() {
        assertEquals(8, truckOnBridge.solution(2, 10, new int[]{7, 4, 5, 6}));
    }

    @Test
    void case2() {
        assertEquals(101, truckOnBridge.solution(100, 100, new int[]{10}));
    }

    @Test
    void case3() {
        assertEquals(110, truckOnBridge.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }

    @Test
    void custom_case1() {
        assertEquals(23, truckOnBridge.solution(10, 10, new int[]{1,2,3,5,1,1}));
    }
}