package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String[]args) {

        SecondChallenge runner = new SecondChallenge();
        String result = "Sorry.";

        try {
            result = runner.probablyIWillThrowException(1, 2);
        } catch (Exception e) {
            System.out.println("We've got a problem " + e);
        } finally {
            System.out.println(result);
        }
    }

}
