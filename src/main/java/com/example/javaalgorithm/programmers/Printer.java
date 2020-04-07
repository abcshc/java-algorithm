package com.example.javaalgorithm.programmers;

import java.util.LinkedList;

public class Printer {
    public int solution(int[] priorities, int location) {
        LinkedList<Document> documents = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            documents.offer(new Document(i, priorities[i]));
        }
        int answer = 0;
        while (!documents.isEmpty()) {
            Document document = documents.poll();
            if (document.priority < documents.stream().mapToInt(i -> i.priority).max().orElse(0)) {
                documents.offer(document);
            } else {
                answer++;
                if (location == document.index) {
                    return answer;
                }
            }
        }

        return 0;
    }

    private class Document {
        int index;
        int priority;

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
