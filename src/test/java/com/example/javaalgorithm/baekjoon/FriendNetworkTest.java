package com.example.javaalgorithm.baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FriendNetworkTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void case1() {
        FriendNetwork.solution(3, new String[]{"Fred Barney", "Barney Betty", "Betty Wilma"});
        assertEquals("2\n3\n4\n", outContent.toString());
    }

    @Test
    public void case2() {
        FriendNetwork.solution(3, new String[]{"Fred Barney", "Betty Wilma", "Barney Betty"});
        assertEquals("2\n2\n4\n", outContent.toString());
    }
}