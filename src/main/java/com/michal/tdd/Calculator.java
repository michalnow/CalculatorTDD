package com.michal.tdd;

import java.util.Arrays;

public class Calculator {
    
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }


    public double divide(int dividend, int divisor) {

        if(divisor == 0){
            throw new ArithmeticException("dividing by zero");
        }

        return dividend / divisor;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int add(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
