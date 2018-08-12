package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {

        public void allFlightsFrom (List< Flight > theFlight, String departure){
            theFlight.stream()
                    .filter(flight -> flight.getDeparture().equals(departure))
                    .forEach(System.out::println);
        }

        public void allFlightsTo (List < Flight > theFlight, String destination){
            theFlight.stream()
                    .filter(flight -> flight.getDestination().equals(destination))
                    .forEach(System.out::println);
        }

        public void connectingFlights (List <Flight> theFlight, String destination, String departure){
            List<Flight> destinationFlights = theFlight.stream()
                    .filter(desFlight -> desFlight.getDestination().equals(destination))
                    .collect(Collectors.toList());

            List<Flight> departureFlights = theFlight.stream()
                    .filter(depFlights -> depFlights.getDeparture().equals(departure))
                    .collect(Collectors.toList());

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
