package com.kodilla.good.patterns.challenges.flights;

public class App {

    public static void main (String[]args){

        FlightsRepository flightsRepository = new FlightsRepository();

        flightsRepository.allFlightsFrom("Sacramento");
        System.out.println(" ");
        flightsRepository.allFlightsTo("Charleston");
        System.out.println(" ");
        flightsRepository.connectingFlights("Charleston", "Sacramento");
    }
}
