package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javafx.scene.input.KeyCode.T;

public class App {

    public static void main (String[]args){

        FlightsRepository flightsRepository = new FlightsRepository();

        System.out.println("All flights from: ");

        flightsRepository.theFlight.stream()
                .filter(flight -> flight.getDeparture().equals("Sacramento"))
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("All flights to: ");

        flightsRepository.theFlight.stream()
                .filter(flight -> flight.getDestination().equals("Charleston"))
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Flight through: ");
        flightsRepository.theFlight.stream()
                .peek(flight -> flight.getDeparture())
                .filter(flight -> (flight.getDeparture() == "Doha" || flight.getDestination() == "Berlin"))
                .forEach(System.out::println);


    }
}
