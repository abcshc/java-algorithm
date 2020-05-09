package com.example.javaalgorithm.baekjoon;

import java.util.HashMap;
import java.util.Scanner;

// 시간 초과
public class FriendNetwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < caseCount; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            String[] connections = new String[count];
            for (int j = 0; j < count; j++) {
                connections[j] = scanner.nextLine();
            }
            solution(count, connections);
        }
    }

    public static void solution(int count, String[] connections) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] parents = new int[count * 2];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
        int nextIndex = 0;
        for (String connection : connections) {
            String[] names = connection.split(" ");
            int sIndex;
            if (map.containsKey(names[0])) {
                sIndex = map.get(names[0]);
            } else {
                map.put(names[0], nextIndex);
                sIndex = nextIndex;
                nextIndex++;
            }

            int eIndex;
            if (map.containsKey(names[1])) {
                eIndex = map.get(names[1]);
            } else {
                map.put(names[1], nextIndex);
                eIndex = nextIndex;
                nextIndex++;
            }

            int sParent = findParent(parents, sIndex);
            int eParent = findParent(parents, eIndex);
            if (sParent > eParent) {
                parents[sIndex] = eParent;
            } else if (sParent < eParent) {
                parents[eIndex] = sParent;
            }

            System.out.println(map.values().stream().filter(it -> findParent(parents, it) == 0).count());
        }
    }

    private static int findParent(int[] parents, int index) {
        if (parents[index] == index) {
            return index;
        } else {
            return parents[index] = findParent(parents, parents[index]);
        }
    }
}
