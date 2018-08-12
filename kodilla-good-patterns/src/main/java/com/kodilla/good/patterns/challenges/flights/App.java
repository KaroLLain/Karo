package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class App {

    public static void main (String[] args){

        FlightSearcher flightSearcher = new FlightSearcher();
        FlightsRepository flightsRepository = new FlightsRepository();
        List<Flight> list = flightsRepository.getTheFlight();

        flightSearcher.allFlightsFrom(list, "Sacramento");
        System.out.println();

        flightSearcher.allFlightsTo(list, "Charleston");
        System.out.println();

        flightSearcher.connectingFlights(list, "Charleston", "Doha");
    }
}
