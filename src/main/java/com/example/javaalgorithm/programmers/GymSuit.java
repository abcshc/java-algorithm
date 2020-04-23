package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        ArrayList<Integer> lostList = new ArrayList<>();
        for (int i = 0; i < lost.length; i++) {
            lostList.add(lost[i]);
        }
        Arrays.sort(reserve);
        ArrayList<Integer> reserveList = new ArrayList<>();
        for (int i = 0; i < reserve.length; i++) {
            int current = reserve[i];
            if (lostList.contains(current)) {
                lostList.removeIf(it -> it.equals(current));
            } else {
                reserveList.add(current);
            }
        }
        int lostIndex = 0;
        int availableCount = 0;
        for (int i = 0; i < reserveList.size() && lostIndex < lostList.size(); i++) {
            int currentReserve = reserveList.get(i);
            while (lostIndex < lostList.size() && lostList.get(lostIndex) < currentReserve - 1) {
                lostIndex++;
            }

            if (lostIndex < lostList.size() && lostList.get(lostIndex) >= currentReserve - 1 && lostList.get(lostIndex) <= currentReserve + 1) {
                availableCount++;
                lostIndex++;
            }
        }

        return n - lostList.size() + availableCount;
    }
}
