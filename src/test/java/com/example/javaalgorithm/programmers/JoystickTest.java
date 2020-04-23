package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoystickTest {
    private Joystick joystick = new Joystick();

    @Test
    void case1() {
        assertEquals(56, joystick.solution("JEROEN"));
    }

    @Test
    void case2() {
        assertEquals(23, joystick.solution("JAN"));
    }

    @Test
    void case3() {
        assertEquals(11, joystick.solution("JAZ"));
    }

    @Test
    void case4() {
        assertEquals(8, joystick.solution("BBBAAB"));
    }
}