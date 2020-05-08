package com.example.javaalgorithm.leetcode;

import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        try {
            return s.indexOf(map.entrySet().stream().filter(it -> it.getValue() == 1).findFirst().orElseThrow().getKey());
        } catch (NoSuchElementException e) {
            return -1;
        }
    }
}
