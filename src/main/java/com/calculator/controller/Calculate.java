package com.calculator.controller;

import org.springframework.stereotype.Service;

@Service
public class Calculate {

    public double addNumbers(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double subtractNumbers(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public double multiplyNumbers(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public double divideNumbers(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

}
