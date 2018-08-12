package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Dispaly {

    public void displayValue(double val){
        System.out.println(val);
    }
}
