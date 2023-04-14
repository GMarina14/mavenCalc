package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final Calculate calculate;

    public FirstController(Calculate calculate) {
        this.calculate = calculate;
    }

    @GetMapping
    public String showHello() {
        return "Welcome to the calculator";
    }

    @GetMapping("/plus")
    public String addNumbers(@RequestParam(required = true) double num1, @RequestParam(required = true) double num2) {
        return "The sum equals " + calculate.addNumbers(num1, num2);
    }

    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam(required = true) double num1, @RequestParam(required = true) double num2) {
        return "The subtraction equals " + calculate.subtractNumbers(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam(required = true) double num1, @RequestParam(required = true) double num2) {
        return "The multiplication equals " + calculate.multiplyNumbers(num1, num2);
    }

    @GetMapping("divide")
    public String divideNumbers(@RequestParam(required = true) double num1, @RequestParam(required = true) double num2) {
        if (num2 == 0) {
            return "Division by zero is forbidden!";
            // throw new IllegalArgumentException("Division by zero is forbidden!");

        }
        return "The division equals " + calculate.divideNumbers(num1, num2);
    }
}
