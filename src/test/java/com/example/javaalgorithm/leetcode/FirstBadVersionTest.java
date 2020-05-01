package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {
    FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    void case0() {
        firstBadVersion.setFirstBadVersion(1);
        assertEquals(1, firstBadVersion.firstBadVersion(1));
    }

    @Test
    void case1() {
        firstBadVersion.setFirstBadVersion(4);
        assertEquals(4, firstBadVersion.firstBadVersion(5));
    }

    @Test
    void case2() {
        firstBadVersion.setFirstBadVersion(4);
        assertEquals(4, firstBadVersion.firstBadVersion(Integer.MAX_VALUE));
    }
}