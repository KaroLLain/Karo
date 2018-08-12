package com.kodilla.good.patterns.challenges.flights;


import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {

        private List<Flight> theFlight = new ArrayList<>();

        public FlightsRepository() {
        theFlight.add(new Flight("Doha", "Warsaw"));
        theFlight.add(new Flight("Sacramento", "Carson City"));
        theFlight.add(new Flight("Sacramento", "Berlin"));
        theFlight.add(new Flight("Carson City", "Charleston"));
        theFlight.add(new Flight("Sacramento", "Johnson City"));
        theFlight.add(new Flight("Berlin", "Atlanta"));
        theFlight.add(new Flight("Warsaw", "Charleston"));
        theFlight.add(new Flight("Johnson City", "Charleston"));
        }

        public List<Flight> getTheFlight() {
            return new ArrayList<>(theFlight);
        }
}

