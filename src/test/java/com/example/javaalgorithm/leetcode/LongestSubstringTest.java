package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
    private LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    void case1() {
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void case2() {
        assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void case4() {
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void case3() {
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void case5() {
        assertEquals(0, longestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    void case6() {
        assertEquals(1, longestSubstring.lengthOfLongestSubstring(" "));
    }

    @Test
    void case7() {
        assertEquals(2, longestSubstring.lengthOfLongestSubstring("au"));
    }

    @Test
    void case8() {
        assertEquals(2, longestSubstring.lengthOfLongestSubstring("abba"));
    }
}