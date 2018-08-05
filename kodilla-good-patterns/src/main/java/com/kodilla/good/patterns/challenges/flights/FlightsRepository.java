package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class FlightsRepository {

    public List<Flight> theFlight = new LinkedList<>();

    public FlightsRepository(){
        
        theFlight.add(new Flight(213, "Doha", "Warsaw"));
        theFlight.add(new Flight(826, "Sacramento", "Atlanta"));
        theFlight.add(new Flight(245, "Sacramento", "Boise"));
        theFlight.add(new Flight(116, "Carson City", "Charleston"));
        theFlight.add(new Flight(151, "Warsaw", "Berlin"));
        theFlight.add(new Flight(120, "Berlin", "Atlanta"));
        theFlight.add(new Flight(121, "Sacramento", "Charleston"));
        theFlight.add(new Flight(340, "Johnson City", "Charleston"));
    }

}
