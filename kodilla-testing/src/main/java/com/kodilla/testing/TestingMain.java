package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main (String[]args)
    {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

                if(result.equals("theForumUser")){
                    System.out.println("test OK");
                }else{
                    System.out.println("Error!");
                }

        Calculator calculator = new Calculator();

        int additionResult = calculator.add(10,7);

                if(additionResult == additionResult){
                    System.out.println(additionResult + " " + "Test OK");
                }else{
                    System.out.println("Error");
                }
        int subtractionResult = calculator.subtract(10,7);

                if (subtractionResult == subtractionResult){
                    System.out.println(subtractionResult + " " + "Test OK");
                }else{
                    System.out.println("Error");
                }
    }
}
