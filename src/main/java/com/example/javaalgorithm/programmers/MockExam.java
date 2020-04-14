package com.example.javaalgorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;

public class MockExam {
    public int[] solution(int[] answers) {
        ArrayList<Abandoner> abandoners = new ArrayList<>();
        abandoners.add(new Abandoner(1, new int[]{1, 2, 3, 4, 5}));
        abandoners.add(new Abandoner(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}));
        abandoners.add(new Abandoner(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));
        for (int i = 0; i < answers.length; i++) {
            for (Abandoner abandoner : abandoners) {
                abandoner.scoreQuestion(i, answers[i]);
            }
        }
        abandoners.sort(Comparator.comparing(Abandoner::getScore).reversed());
        int maxScore = abandoners.get(0).getScore();
        return abandoners.stream().filter(it -> it.getScore() == maxScore).mapToInt(it -> it.index).toArray();
    }

    private class Abandoner {
        int index;
        int count;
        int[] answers;
        int score = 0;

        Abandoner(int index, int[] answers) {
            this.answers = answers;
            this.count = answers.length;
            this.index = index;
        }

        public void scoreQuestion(int index, int answer) {
            if (answers[index % count] == answer) {
                score++;
            }
        }

        public int getScore() {
            return score;
        }
    }
}
