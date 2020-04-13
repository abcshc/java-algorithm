package com.example.javaalgorithm.programmers;

import java.util.ArrayList;

public class LargestNumber {
    public String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(String.valueOf(number));
        }
        list.sort((o1, o2) -> Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2));
        String answer = String.join("", list);
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
