package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test 
    void substraction(){
        assertEquals(1, calculator.substract(2,1));
    }

}