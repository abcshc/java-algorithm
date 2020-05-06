package com.example.javaalgorithm.leetcode;

import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        HashSet<String> starts = new HashSet<>();
        HashSet<String> ends = new HashSet<>();

        for (List<String> path : paths) {
            String start = path.get(0);
            String end = path.get(1);

            if(ends.contains(start)) {
                ends.remove(start);
            } else {
                starts.add(start);
            }

            if(starts.contains(end)) {
                starts.remove(end);
            } else {
                ends.add(end);
            }
        }

        return (String) ends.toArray()[0];
    }
}
