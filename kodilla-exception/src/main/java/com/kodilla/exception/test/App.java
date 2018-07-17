package com.kodilla.exception.test;

import static com.kodilla.exception.test.FlightSearchEngine.findFlight;

public class App {

    public static void main(String[]args){

        Flight flight1 = new Flight("Berlin", "Doha");
        Flight flight2 = new Flight("Bangkok", "Chiang Mai");
        Flight flight3 = new Flight("Warsaw", "Wroclaw");

        try {
            findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception encountered: " + e);
        }
    }
}
