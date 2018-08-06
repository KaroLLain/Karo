package com.kodilla.good.patterns.challenges.flights;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsRepository {

    public List<Flight> flightsRepository(){
        List<Flight> theFlight = new LinkedList<>();
        theFlight.add(new Flight("Doha", "Warsaw"));
        theFlight.add(new Flight("Sacramento", "Carson City"));
        theFlight.add(new Flight("Sacramento", "Berlin"));
        theFlight.add(new Flight("Carson City", "Charleston"));
        theFlight.add(new Flight("Sacramento", "Johnson City"));
        theFlight.add(new Flight("Berlin", "Atlanta"));
        theFlight.add(new Flight("Berlin", "Charleston"));
        theFlight.add(new Flight("Johnson City", "Charleston"));

        return theFlight;
    }

    public void allFlightsFrom(String departure) {

        List<Flight> flights = flightsRepository().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toList());

        for (Flight flight : flights) {
            System.out.println(flight.getDeparture() + " to: " + flight.getDestination());
        }
    }

    public void allFlightsTo(String destination) {

        List<Flight> flights = flightsRepository().stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .collect(Collectors.toList());

        for (Flight flight : flights) {
            System.out.println(flight.getDestination() + " from: " + flight.getDeparture());
        }
    }

    public void connectingFlights(String destination, String departure) {
        List<Flight> flights = flightsRepository().stream()
                .filter(flight -> flight.getDeparture().equals(departure) || flight.getDestination().equals(destination))
                .collect(Collectors.toList());

        for (Flight flight : flights) {
            System.out.println("Flight from " + flight.getDeparture() + " to " + flight.getDestination());
        }
    }
}

