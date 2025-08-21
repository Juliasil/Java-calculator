package dev.aguil;

public class Calculator {
    static int sum(int number1, int number2) {
        return number1 + number2;
        
    }

    static int subtract(int number1, int number2) {
        return number1 - number2;
        
    }

    static int Multiply(int number1, int number2) {
        return number1 * number2;
    }

    static int Divide(int number1, int number2) {
        if(number2 == 0) {
            throw new ArithmeticException("Division by Zero not allowed.");
        }
        return number1 / number2;
    }
}

