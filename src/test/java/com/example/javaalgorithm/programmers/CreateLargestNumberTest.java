package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateLargestNumberTest {
    private CreateLargestNumber createLargestNumber = new CreateLargestNumber();

    @Test
    void case1() {
        assertEquals("94", createLargestNumber.solution("1924", 2));
    }

    @Test
    void case2() {
        assertEquals("3234", createLargestNumber.solution("1231234", 3));
    }

    @Test
    void case3() {
        assertEquals("775841", createLargestNumber.solution("4177252841", 4));
    }

    @Test
    void case4() {
        assertEquals("77252841", createLargestNumber.solution("4177252841", 2));
    }

    @Test
    void case5() {
        assertEquals("77777", createLargestNumber.solution("7777777", 2));
    }

    @Test
    void case6() {
        assertEquals("87654", createLargestNumber.solution("87654321", 3));
    }

    @Test
    void case7() {
        assertEquals("11", createLargestNumber.solution("1111", 2));
    }

    @Test
    void case8() {
        assertEquals("77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", createLargestNumber.solution("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", 2));
    }
}