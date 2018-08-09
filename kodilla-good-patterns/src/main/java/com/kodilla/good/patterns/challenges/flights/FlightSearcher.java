package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

        public void allFlightsFrom (Set < Flight > theFlight, String departure){
            theFlight.stream()
                    .filter(flight -> flight.getDeparture().equals(departure))
                    .forEach(System.out::println);
        }

        public void allFlightsTo (Set < Flight > theFlight, String destination){
            theFlight.stream()
                    .filter(flight -> flight.getDestination().equals(destination))
                    .forEach(System.out::println);
        }

        public void connectingFlights (Set <Flight> theFlight, String destination, String departure){
            Set<Flight> destinationFlights = theFlight.stream()
                    .filter(desFlight -> desFlight.getDestination().equals(destination))
                    .collect(Collectors.toSet());

            Set<Flight> departureFlights = theFlight.stream()
                    .filter(depFlights -> depFlights.getDeparture().equals(departure))
                    .collect(Collectors.toSet());

            for (Flight flightTo : destinationFlights) {
                for (Flight flightFrom : departureFlights) {
                    if (flightTo.getDestination().equals(flightFrom.getDeparture())) {
                        System.out.println(destinationFlights);
                        System.out.println(departureFlights);
                    }
                }
            }
        }
}
