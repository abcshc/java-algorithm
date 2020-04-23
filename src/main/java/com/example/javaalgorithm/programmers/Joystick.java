package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Joystick {
    public int solution(String name) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int answer = 0;
        boolean isCount = false;
        int startIndex = 0;
        int endIndex = 0;
        int length = name.length();

        List<APosition> aPositionList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            char current = name.charAt(i);
            int nextIndex = alphabet.indexOf(current);
            answer += Math.min(nextIndex, alphabet.length() - nextIndex);
            if (current == 'A') {
                if (!isCount) {
                    isCount = true;
                    startIndex = i;
                }
                endIndex = i;
            } else {
                if (isCount) {
                    aPositionList.add(new APosition(startIndex, endIndex, length));
                }
                isCount = false;
            }
        }

        aPositionList.sort(Comparator.comparing(APosition::shortestPath));
        if(aPositionList.isEmpty()) {
            return answer + length - 1;
        } else {
            return answer + Math.min(length - 1, aPositionList.get(0).shortestPath());
        }
    }

    private class APosition {
        private final int startIndex;
        private final int endIndex;
        private final int length;

        public APosition(int startIndex, int endIndex, int length) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.length = length;
        }

        public int getLength() {
            return endIndex - startIndex + 1;
        }

        public int shortestPath() {
            int start = (startIndex - 1) * 2 + length - endIndex - 1;
            int end = (length - endIndex - 1) * 2 + startIndex - 1;
            return Math.min(start, end);
        }
    }
}
