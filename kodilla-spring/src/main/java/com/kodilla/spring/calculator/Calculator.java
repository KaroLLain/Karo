package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Dispaly dispaly;

    public void add(double a, double b){
       dispaly.displayValue(a + b);
    }

    public void sub(double a, double b){
        dispaly.displayValue(a - b);
    }

    public void mul(double a, double b){
        dispaly.displayValue(a * b);
    }

    public void div(double a, double b){
        dispaly.displayValue(a / b);
    }

}
