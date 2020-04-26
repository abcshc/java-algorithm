package com.example.javaalgorithm.programmers;

import java.util.Arrays;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int f = 0;
        int l = people.length - 1;
        while(f <= l) {
            if(people[f] + people[l] <= limit) {
                f++;
            }
            l--;
            answer++;
        }
        return answer;
    }
}
