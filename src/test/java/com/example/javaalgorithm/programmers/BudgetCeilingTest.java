package com.example.javaalgorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetCeilingTest {
    private BudgetCeiling budgetCeiling = new BudgetCeiling();

    @Test
    void case1() {
        assertEquals(127, budgetCeiling.solution(new int[]{120, 110, 140, 150}, 485));
    }
}