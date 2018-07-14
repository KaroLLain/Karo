package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {

    public static void main(String[]args) {

        //lambda - ExpressionExecutor

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));
        System.out.println(" ");

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::subAfromB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::divideAByB);
        System.out.println(" ");

        //beautifier - PoemBeautifier

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Beautifying in progress...");
        String beautyPoem1 = poemBeautifier.beautify("Beautify me...", (text) -> "ABC " + text + "ABC");
        System.out.println(beautyPoem1);
        String beautyPoem2 = poemBeautifier.beautify("Beautify me...", (text) -> text.toUpperCase());
        System.out.println(beautyPoem2);
        String beautyPoem3 = poemBeautifier.beautify("Beautify me...", (text) -> {
            String a = "a";
            StringBuilder aB = new StringBuilder(a);
            for (int i=0; i<=4; i++){
                aB.append("a");
            }
            return aB.toString() + " " + text;
        });
        System.out.println(beautyPoem3);
        String beautyPoem4 = poemBeautifier.beautify("Beautify me...", (text) -> "I am " + text.substring(0, 7) + "ul!");
        System.out.println(beautyPoem4);
        System.out.println(" ");

        //iterate - NumbersGenerator

        System.out.println("Using stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
