package com.example.javaalgorithm.leetcode;

import java.util.ArrayList;
import java.util.Comparator;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Num> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(new Num(i, nums[i]));
        }

        numList.sort(Comparator.comparing(Num::getNumber));

        for (int i = 0; i < numList.size() - 1; i++) {
            for (int j = i + 1; j < numList.size(); j++) {
                Num num1 = numList.get(i);
                Num num2 = numList.get(j);
                if (num1.number + num2.number == target) {
                    return new int[]{num1.index, num2.index};
                }

                if(num1.number + num2.number > target) {
                    break;
                }
            }
        }
        return new int[]{};
    }

    private class Num {
        private int index;
        private int number;

        public Num(int index, int number) {
            this.index = index;
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
}
