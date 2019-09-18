package com.michal.tdd;

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
}
