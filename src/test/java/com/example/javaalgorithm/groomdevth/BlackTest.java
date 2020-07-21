package com.example.javaalgorithm.groomdevth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlackTest {
    private Black black = new Black();
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
        black.run(new StringReader("4 3\n" +
                "2 3 1 4"));
        assertEquals("2", outContent.toString());
    }

    @Test
    void case2() throws IOException {
        black.run(new StringReader("8 3\n" +
                "7 3 1 8 4 6 2 5"));
        assertEquals("4", outContent.toString());
    }

    @Test
    void case3() throws IOException {
        black.run(new StringReader("37 4\n" +
                "31 36 20 30 1 9 6 13 3 29 11 25 7 8 2 24 34 18 26 15 23 28 37 19 21 4 32 14 16 10 12 27 22 35 5 17 33"));
        assertEquals("12", outContent.toString());
    }
}