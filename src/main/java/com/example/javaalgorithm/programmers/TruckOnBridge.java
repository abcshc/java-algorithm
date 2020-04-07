package com.example.javaalgorithm.programmers;

import java.util.LinkedList;

public class TruckOnBridge {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Bridge bridge = new Bridge(bridgeLength, weight);
        for (int truckWeight : truckWeights) {
            if (!bridge.isPossibleLoad(truckWeight)) {
                bridge.waitToGetOffAndLoad(new Truck(truckWeight));
            } else {
                bridge.load(new Truck(truckWeight));
            }
        }
        bridge.waitForAllToGetOff();

        return bridge.getTime();
    }

    private class Bridge {
        private int bridgeLength;
        private int weight;
        private LinkedList<Truck> trucks;
        private int time = 0;

        public Bridge(int bridgeLength, int weight) {
            trucks = new LinkedList<>();
            this.bridgeLength = bridgeLength;
            this.weight = weight;
        }

        public boolean isPossibleLoad(int truckWeight) {
            return weight >= trucks.stream().mapToInt(Truck::getWeight).sum() + truckWeight;
        }

        public void load(Truck truck) {
            moveTrucksOnBridge(1);
            trucks.offer(truck);
            time++;
        }

        public void waitToGetOffAndLoad(Truck truck) {
            while(!isPossibleLoad(truck.getWeight())) {
                int distance = bridgeLength - trucks.getFirst().getLocation();
                moveTrucksOnBridge(distance);
                time += distance;
            }
            trucks.offer(truck);
        }

        public int getTime() {
            return time;
        }

        public void waitForAllToGetOff() {
            int distance = bridgeLength - trucks.getLast().getLocation();
            moveTrucksOnBridge(distance);
            time += distance;
        }

        private void moveTrucksOnBridge(int distance) {
            if (!trucks.isEmpty()) {
                trucks.forEach(it -> it.move(distance));
                if (trucks.getFirst().getLocation() >= bridgeLength) {
                    trucks.poll();
                }
            }
        }
    }

    private class Truck {
        private int location;
        private int weight;

        public Truck(int weight) {
            this.location = 0;
            this.weight = weight;
        }

        public void move(int distance) {
            this.location += distance;
        }

        public int getLocation() {
            return location;
        }

        public int getWeight() {
            return weight;
        }
    }
}