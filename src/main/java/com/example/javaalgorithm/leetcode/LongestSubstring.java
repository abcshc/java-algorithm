package com.example.javaalgorithm.leetcode;

import java.util.HashMap;

// Longest Substring Without Repeating Characters
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        if(c.length == 0) {
            return 0;
        }
        HashMap<Character, Integer> set = new HashMap<>();
        int max = 0;

        int start = 0;
        int end = 1;
        set.put(c[0], 0);

        while (start < c.length && end < c.length) {
            if (set.containsKey(c[end])) {
                if(start < set.get(c[end]) + 1) {
                    start = set.get(c[end]) + 1;
                }

            }
            set.put(c[end], end);
            if (max < end - start + 1) {
                max = end - start + 1;
            }
            end++;
        }
        if(max == 0) {
            return 1;
        }
        return max;
    }
}
