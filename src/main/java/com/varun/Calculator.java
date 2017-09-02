package com.varun;

public class Calculator {

    CalculatorService service;

    public Calculator(CalculatorService service) {

        this.service = service;

    }

    public int perform (int i, int j) {       // Expected Output 2 3 => (i + j)*i

        return service.add(i, j)*i;

    }
}
