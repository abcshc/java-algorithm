package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LargestNumber {
    public String solution(int[] numbers) {
        Comparator<String> comparator = (o1, o2) -> {
            int s1 = Integer.parseInt(o1 + o2);
            int s2 = Integer.parseInt(o2 + o1);
            return s2 - s1;
        };
        ArrayList<String> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(String.valueOf(number));
        }
        list.sort(comparator);
        String answer = list.stream().collect(Collectors.joining());
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
