package com.example.javaalgorithm.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class FindPrimeNumber {
    public int solution(String numbers) {
        ArrayList<Character> characters = new ArrayList<>();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < numbers.length(); i++) {
            char num = numbers.charAt(i);
            characters.add(num);
            if (count.containsKey(num)) {
                int cnt = count.get(num);
                count.put(num, cnt + 1);
            } else {
                count.put(num, 1);
            }
        }

        characters.sort(Comparator.reverseOrder());
        int max = Integer.parseInt(characters.stream().map(String::valueOf).collect(Collectors.joining()));
        int result = 0;
        for (int i = 0; i < max + 1; i++) {
            String current = String.valueOf(i);
            boolean isContains = true;
            HashMap<Character, Integer> inCount = new HashMap<>();
            for (int j = 0; j < current.length(); j++) {
                Character charJ = current.charAt(j);
                if (!characters.contains(charJ)) {
                    isContains = false;
                    break;
                }

                if (inCount.containsKey(charJ)) {
                    int cnt = inCount.get(charJ);
                    if (count.get(charJ) < cnt + 1) {
                        isContains = false;
                        break;
                    }
                    inCount.put(charJ, cnt + 1);
                } else {
                    inCount.put(charJ, 1);
                }
            }
            if (isContains && isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
