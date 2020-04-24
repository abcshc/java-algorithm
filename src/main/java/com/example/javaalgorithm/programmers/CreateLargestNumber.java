package com.example.javaalgorithm.programmers;

public class CreateLargestNumber {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);

        int startIndex = 0;
        while (k != 0) {
            int largestIndex = startIndex;
            int largestValue = 0;
            for (int i = startIndex; i < startIndex + k + 1 && i < sb.length(); i++) {
                if(sb.charAt(i) > largestValue) {
                    largestIndex = i;
                    largestValue = sb.charAt(i);
                }
            }

            if(startIndex >= sb.length() - 1) {
                int deleteIndex = sb.length() - k;
                for (int i = 0; i < k; i++) {
                    sb.deleteCharAt(deleteIndex);
                }
                break;
            }
            if (startIndex != largestIndex) {
                for (int i = startIndex; i < largestIndex; i++) {
                    sb.deleteCharAt(startIndex);
                    k--;
                }
            }
            startIndex++;
        }

        return sb.toString();
    }
}
