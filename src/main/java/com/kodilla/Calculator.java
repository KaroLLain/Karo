package com.kodilla;

class Calculator {

    public int addTo(int a, int b) {

        return a + b;
    }

    public int subtractFrom(int a, int b) {

        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.addTo(11,21);
        int result2 = calculator.subtractFrom(21,11);

        System.out.println("Result of addition: " + result1);
        System.out.println("Result of subtraction: " + result2);
    }
}