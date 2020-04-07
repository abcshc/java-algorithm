package com.example.javaalgorithm.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RamenFactory {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        PriorityQueue<Supply> supplyQueue = new PriorityQueue<>(Comparator.comparing(Supply::getDate));
        for (int i = 0; i < dates.length; i++) {
            supplyQueue.offer(new Supply(dates[i], supplies[i]));
        }
        PriorityQueue<Supply> available = new PriorityQueue<>(Comparator.comparing(Supply::getSupply).reversed());

        int answer = 0;
        while (stock < k) {
            while(!supplyQueue.isEmpty() && supplyQueue.peek().availableSupply(stock)) {
                available.offer(supplyQueue.poll());
            }
            stock = stock + available.poll().supply;
            answer++;
        }

        return answer;
    }

    private class Supply {
        int date;
        int supply;

        public Supply(int date, int supply) {
            this.date = date;
            this.supply = supply;
        }

        public int getSupply() {
            return supply;
        }

        public boolean availableSupply(int stock) {
            return date <= stock;
        }

        public int getDate() {
            return date;
        }
    }
}
