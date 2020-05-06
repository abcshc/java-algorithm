package com.example.javaalgorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationCityTest {
    DestinationCity destinationCity = new DestinationCity();

    @Test
    void case1() {
        List<List<String>> path = new ArrayList<>();
        path.add(new ArrayList<>(Arrays.asList("London", "New York")));
        path.add(new ArrayList<>(Arrays.asList("New York", "Lima")));
        path.add(new ArrayList<>(Arrays.asList("Lima", "Sao Paulo")));

        assertEquals("Sao Paulo", destinationCity.destCity(path));
    }

    @Test
    void case2() {
        List<List<String>> path = new ArrayList<>();
        path.add(new ArrayList<>(Arrays.asList("B", "C")));
        path.add(new ArrayList<>(Arrays.asList("D", "B")));
        path.add(new ArrayList<>(Arrays.asList("C", "A")));

        assertEquals("A", destinationCity.destCity(path));
    }

    @Test
    void case3() {
        List<List<String>> path = new ArrayList<>();
        path.add(new ArrayList<>(Arrays.asList("A", "Z")));

        assertEquals("Z", destinationCity.destCity(path));
    }
}