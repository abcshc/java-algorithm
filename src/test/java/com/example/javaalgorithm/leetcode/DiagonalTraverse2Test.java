package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DiagonalTraverse2Test {
    DiagonalTraverse2 diagonalTraverse2 = new DiagonalTraverse2();

    @Test
    void case1() {
        assertArrayEquals(new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9}, diagonalTraverse2.findDiagonalOrder(arrayToList(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16}, diagonalTraverse2.findDiagonalOrder(arrayToList(new int[][]{{1, 2, 3, 4, 5}, {6, 7}, {8}, {9, 10, 11}, {12, 13, 14, 15, 16}})));
    }

    @Test
    void case3() {
        assertArrayEquals(new int[]{1, 4, 2, 5, 3, 8, 6, 9, 7, 10, 11}, diagonalTraverse2.findDiagonalOrder(arrayToList(new int[][]{{1, 2, 3}, {4}, {5, 6, 7}, {8}, {9, 10, 11}})));
    }

    @Test
    void case4() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, diagonalTraverse2.findDiagonalOrder(arrayToList(new int[][]{{1, 2, 3, 4, 5, 6}})));
    }

    @Test
    void case5() {
        assertArrayEquals(new int[]{14, 13, 12, 11, 14, 19, 13, 15, 16, 1, 8, 9, 11}, diagonalTraverse2.findDiagonalOrder(arrayToList(new int[][]{{14, 12, 19, 16, 9}, {13, 14, 15, 8, 11}, {11, 13, 1}})));
    }

    @Test
    void case6() {
        assertArrayEquals(new int[]{1, 11, 36, 35, 27, 9, 5, 16, 7, 7, 12, 40, 7, 38, 4, 29, 17, 27, 7, 32, 20, 13, 5, 2, 37, 21, 17, 1, 34, 19, 3, 26, 13, 13, 7, 20, 37, 17, 24, 4, 9, 32, 7, 6, 34, 4, 32, 9},
                diagonalTraverse2.findDiagonalOrder(arrayToList(new int[][]{{1, 36, 9, 7, 4, 20, 1, 7}, {11, 27, 7, 38, 32, 17, 13}, {35, 16, 7, 7, 21, 13}, {5, 40, 27, 37, 26}, {12, 17, 2, 3, 17, 9, 6, 4}, {29, 5, 19, 37, 4, 7, 34, 32, 9}, {13, 34, 20, 24, 32}})));
    }

    private List<List<Integer>> arrayToList(int[][] array) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] row : array) {
            List<Integer> list = new ArrayList<>();
            for (int i : row) {
                list.add(i);
            }
            lists.add(list);
        }
        return lists;
    }
}