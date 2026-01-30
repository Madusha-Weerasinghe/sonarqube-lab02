package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testOperations() {
        Calculator calc = new Calculator();
        
   
        assertEquals(15, calc.calculate(10, 5, "add"));
        assertEquals(15, calc.calculate(10, 5, "add-again"));
        assertEquals(5, calc.calculate(10, 5, "sub"));
        assertEquals(50, calc.calculate(10, 5, "mul"));
        assertEquals(2, calc.calculate(10, 5, "div"));
        assertEquals(0, calc.calculate(10, 0, "div")); 
        assertEquals(100, calc.calculate(10, 2, "pow"));
        assertEquals(0, calc.calculate(10, 5, "unknown"));
    }

    @Test
    public void testAddAgain() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.addAgain(10, 10));
    }

    @Test
public void testCalculatorElseBranch() {
    Calculator calc = new Calculator();
    assertEquals(0, calc.calculate(10, 5, "something-random"));
}
}