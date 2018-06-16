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

                if(additionResult == 17){
                    System.out.println("Test OK");
                }else{
                    System.out.println("Error");
                }
        int subtractionResult = calculator.subtract(10,7);

                if (subtractionResult == 3){
                    System.out.println("Test OK");
                }else{
                    System.out.println("Error");
                }
    }
}
