package com.example.javaalgorithm.groomdevth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeFreeGiftTest {
    private ExchangeFreeGift exchangeFreeGift = new ExchangeFreeGift();
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
        exchangeFreeGift.run(new StringReader("4\n" +
                "12 0\n" +
                "10 14\n" +
                "4 20\n" +
                "5 2147483648"));
        assertEquals("1\n" +
                "2\n" +
                "0\n" +
                "1\n", outContent.toString());
    }
}