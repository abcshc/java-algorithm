package com.example.javaalgorithm.groomdevth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ChoosingProblemTest {
    private ChoosingProblem choosingProblem = new ChoosingProblem();
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
    void case1() throws IOException {
        choosingProblem.run(new StringReader("6\n3 1 4 1 5 9"));
        assertEquals("YES", outContent.toString());
    }

    @Test
    void case2() throws IOException {
        choosingProblem.run(new StringReader("5\n1 10 1 10 1"));
        assertEquals("NO", outContent.toString());
    }
}