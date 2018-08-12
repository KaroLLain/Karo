package com.kodilla.spring.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.add(12.5, 12.5);
        //Then
    }

    @Test
    public void testSub(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.sub(8, 5.25);
        //Then
    }

    @Test
    public void testMul(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.mul(3.5,5.25 );

        //Then

    }

    @Test
    public void testDiv(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.div(15.5, 3.3);
        //Then
    }



}
