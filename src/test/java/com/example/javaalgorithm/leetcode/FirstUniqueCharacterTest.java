package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {
    FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

    @Test
    void case1() {
        assertEquals(0, firstUniqueCharacter.firstUniqChar("leetcode"));
    }

    @Test
    void case2() {
        assertEquals(2, firstUniqueCharacter.firstUniqChar("loveleetcode"));
    }
}