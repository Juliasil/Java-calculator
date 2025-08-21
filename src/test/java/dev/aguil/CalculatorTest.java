package dev.aguil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    @Test
    void MustAddTwoNumbers() {
        assertEquals(2, Calculator.sum(1,1));
        assertEquals(5, Calculator.sum(3,2));
        assertEquals(10, Calculator.sum(5,5));
    }

    @Test
    void MustSubtractTwoNumbers() {
        assertEquals(1, Calculator.subtract(2, 1));
        assertEquals(3, Calculator.subtract(5, 2));
        assertEquals(5, Calculator.subtract(10,5));
    }

    @Test
    void MustMultiplyTwoNumbers() {
        assertEquals(4, Calculator.Multiply(2,2));
        assertEquals(8, Calculator.Multiply(2, 4));
        assertEquals(10, Calculator.Multiply(2,5));

    }

    @Test
    void MustDivideTwoNumbers() {
        assertEquals(3, Calculator.Divide(6,2));
        assertEquals(4, Calculator.Divide(8,2));
        assertEquals(5, Calculator.Divide(10,2));
        
    }

    @Test
    void shouldThrowExceptionWhenDivideToZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.Divide(10, 0));
    }
    
}
