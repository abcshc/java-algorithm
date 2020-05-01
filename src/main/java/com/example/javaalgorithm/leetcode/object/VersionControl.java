package com.example.javaalgorithm.leetcode.object;

public abstract class VersionControl {
    private int firstBadVersion = 0;

    public void setFirstBadVersion(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    protected boolean isBadVersion(int i) {
        return firstBadVersion <= i;
    }
}
