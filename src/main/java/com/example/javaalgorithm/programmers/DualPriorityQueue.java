package com.example.javaalgorithm.programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class DualPriorityQueue {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        for (String operation : operations) {
            int value = Integer.parseInt(operation.substring(2));
            if (operation.startsWith("I")) {
                min.offer(value);
                max.offer(value);
                count++;
            } else {
                if (count != 0) {
                    if (value < 0) {
                        min.poll();
                    } else {
                        max.poll();
                    }
                    count--;
                }
            }
            if (count == 0) {
                min.clear();
                max.clear();
            }
        }
        if (count < 1) {
            return new int[]{0, 0};
        } else {
            return new int[]{max.poll(), min.poll()};
        }
    }
}
