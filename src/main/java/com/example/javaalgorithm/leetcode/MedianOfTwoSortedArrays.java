package com.example.javaalgorithm.leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        boolean isOdd = total % 2 != 0;
        int medianIndex = (int) Math.ceil(total / 2.0) - 1;

        int i1 = 0;
        int i2 = 0;

        int[] result = new int[medianIndex + 2];

        int i = 0;
        while (i2 != nums2.length || i1 != nums1.length) {
            if (i2 == nums2.length || i1 == nums1.length) {
                if (i2 == nums2.length) {
                    result[i] = nums1[i1];
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i2++;
                }
            } else {
                if (nums1[i1] < nums2[i2]) {
                    result[i] = nums1[i1];
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i2++;
                }
            }
            if (i == medianIndex) {
                if (isOdd) {
                    return result[i];
                }
            }
            if (i == medianIndex + 1) {
                return (result[medianIndex] + result[medianIndex + 1]) / 2.0;
            }
            i++;
        }
        return 0;
    }
}
