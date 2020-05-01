package com.example.javaalgorithm.leetcode;

import com.example.javaalgorithm.leetcode.object.VersionControl;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;

        while (first != last) {
            int next = first + (last - first) / 2;
            if (isBadVersion(next)) {
                last = next;

            } else {
                first = next + 1;
            }
        }

        return last;
    }
}