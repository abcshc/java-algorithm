package com.example.javaalgorithm.programmers;

import java.util.*;

public class NumberBaseball {
    public int solution(int[][] baseball) {
        Game game = new Game();
        for (int i = 0; i < baseball.length; i++) {
            game.add(baseball[i][0], baseball[i][1], baseball[i][2]);
        }
        return game.calculateNumberOfCases();
    }

    private class Game {
        ArrayList<BaseBallCount> ballCounts = new ArrayList<>();
        HashSet<Character> invalidNumber = new HashSet<>();
        HashSet<String> available = new HashSet<>();

        public void add(int baseball, int strikeCount, int ballCount) {
            if (strikeCount + ballCount == 0) {
                String number = String.valueOf(baseball);
                invalidNumber.add(number.charAt(0));
                invalidNumber.add(number.charAt(1));
                invalidNumber.add(number.charAt(2));
            } else if (strikeCount + ballCount == 3) {
                String number = String.valueOf(baseball);
                String number1 = number.charAt(0) + "";
                String number2 = number.charAt(1) + "";
                String number3 = number.charAt(2) + "";
                if (strikeCount == 0) {
                    available.add(number3 + number1 + number2);
                    available.add(number2 + number3 + number1);
                } else {
                    available.add(number1 + number3 + number2);
                    available.add(number3 + number2 + number1);
                    available.add(number2 + number1 + number3);
                }
            } else {
                ballCounts.add(new BaseBallCount(baseball, strikeCount, ballCount));
            }
        }

        public int calculateNumberOfCases() {
            Collections.sort(ballCounts);
            if (available.isEmpty()) {
                for (int i = 1; i <= 9; i++) {
                    if (!invalidNumber.contains(Character.forDigit(i, 10))) {
                        for (int j = 1; j <= 9; j++) {
                            if (j != i && !invalidNumber.contains(Character.forDigit(j, 10))) {
                                for (int k = 1; k <= 9; k++) {
                                    if (k != j && k != i && !invalidNumber.contains(Character.forDigit(k, 10))) {
                                        available.add("" + i + j + k);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            for (BaseBallCount count : ballCounts) {
                ArrayList<String> removed = new ArrayList<>();
                for (String number : available) {
                    if (!count.isAvailable(number)) {
                        removed.add(number);
                    }
                }
                for (String number : removed) {
                    available.remove(number);
                }
            }

            return available.size();
        }
    }

    private class BaseBallCount implements Comparable<BaseBallCount> {
        String number1;
        String number2;
        String number3;
        int strikeCount;
        int ballCount;

        BaseBallCount(int baseball, int strikeCount, int ballCount) {
            String number = String.valueOf(baseball);
            number1 = number.charAt(0) + "";
            number2 = number.charAt(1) + "";
            number3 = number.charAt(2) + "";

            this.strikeCount = strikeCount;
            this.ballCount = ballCount;
        }

        public boolean isAvailable(String number) {
            int strikeCount = 0;
            int ballCount = 0;
            String i1 = number.charAt(0) + "";
            String i2 = number.charAt(1) + "";
            String i3 = number.charAt(2) + "";
            if (number1.equals(i1)) {
                strikeCount++;
            } else {
                if (number2.equals(i1) || number3.equals(i1)) {
                    ballCount++;
                }
            }

            if (number2.equals(i2)) {
                strikeCount++;
            } else {
                if (number1.equals(i2) || number3.equals(i2)) {
                    ballCount++;
                }
            }

            if (number3.equals(i3)) {
                strikeCount++;
            } else {
                if (number2.equals(i3) || number1.equals(i3)) {
                    ballCount++;
                }
            }

            return this.ballCount == ballCount && this.strikeCount == strikeCount;
        }

        @Override
        public int compareTo(BaseBallCount o) {
            if (ballCount + strikeCount > o.ballCount + o.strikeCount) {
                return -1;
            } else if (ballCount + strikeCount < o.ballCount + o.strikeCount) {
                return 1;
            } else {
                if (strikeCount > o.strikeCount) {
                    return -1;
                } else if (strikeCount < o.strikeCount) {
                    return 1;
                }
            }
            return 0;
        }
    }
}
