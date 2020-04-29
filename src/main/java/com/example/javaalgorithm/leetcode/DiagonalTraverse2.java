package com.example.javaalgorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiagonalTraverse2 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        ArrayList<LinkedList<Integer>> temp = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int rowIndex = 0;
        for (List<Integer> row : nums) {
            int columnIndex = 0;
            if (rowIndex == nums.size() - 1) {
                int lastIndex = 0;
                for (Integer value : row) {
                    result.add(value);
                    if (temp.size() > rowIndex + lastIndex) {
                        while (!temp.get(rowIndex + lastIndex).isEmpty()) {
                            result.add(temp.get(rowIndex + lastIndex).pop());
                        }
                    }
                    lastIndex++;
                }
                break;
            }
            for (Integer value : row) {
                if (temp.size() <= rowIndex + columnIndex) {
                    temp.add(new LinkedList<>());
                }
                if (columnIndex == 0) {
                    result.add(value);
                    if (temp.size() > rowIndex) {
                        while (!temp.get(rowIndex).isEmpty()) {
                            result.add(temp.get(rowIndex).pop());
                        }
                    }
                } else {
                    temp.get(columnIndex + rowIndex).push(value);
                }
                columnIndex++;
            }
            rowIndex++;
        }

        for (LinkedList<Integer> stack : temp) {
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}