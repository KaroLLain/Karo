package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class App {

    public static void main (String[] args){

        FlightsRepository flightsRepository = new FlightsRepository();
        Set<Flight> list = flightsRepository.getTheFlight();

        FlightSearcher searchAllFlightsFrom = new FlightSearcher();
        searchAllFlightsFrom.allFlightsFrom(list, "Sacramento");
        System.out.println();

        FlightSearcher searchAllFlightsTo = new FlightSearcher();
        searchAllFlightsTo.allFlightsTo(list, "Charleston");
        System.out.println();


        FlightSearcher connections = new FlightSearcher();
        connections.connectingFlights(list, "Charleston", "Doha");
    }
}
