package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class ExpressedAsN {
    public int solution(int N, int number) {
        if (N == number) {
            return 1;
        }

        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        list.add(new HashSet<>());
        list.get(0).add(N);

        list.add(new HashSet<>());
        HashSet<Integer> second = list.get(1);
        second.add(Integer.valueOf("" + N + N));
        second.add(add(N, N));
        second.add(1);
        second.add(multiply(N, N));
        second.add(0);
        if (second.contains(number)) {
            return 2;
        }

        int answer = 3;
        for (int i = answer; i < 9; i++) {
            list.add(new HashSet<>());
            HashSet<Integer> current = list.get(i - 1);

            for (int j = 1; j < i; j++) {
                HashSet<Integer> bs = list.get(i - j - 1);
                HashSet<Integer> ss = list.get(j - 1);
                for (int b : bs) {
                    for (int s : ss) {
                        current.add(add(b, s));
                        if (s != 0) {
                            current.add(divide(b, s));
                        }
                        current.add(multiply(b, s));
                        current.add(subtract(b, s));
                    }
                }
            }

            current.add(Integer.valueOf(String.valueOf(N).repeat(Math.max(0, i))));
            if (current.contains(number)) {
                break;
            }
            answer++;
        }

        if (answer > 8) {
            return -1;
        }
        return answer;
    }

    public int add(int number, int N) {
        return N + number;
    }

    public int divide(int number, int N) {
        return (int) Math.floor(number / N);
    }

    public int multiply(int number, int N) {
        return number * N;
    }

    public int subtract(int number, int N) {
        return number - N;
    }
}
