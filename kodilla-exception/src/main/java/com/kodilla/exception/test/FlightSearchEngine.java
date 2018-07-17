package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearchEngine {


        public static void findFlight(Flight flight) throws RouteNotFoundException {

                HashMap<String, Boolean> flightMap = new HashMap<>();

                flightMap.put("Doha", true);
                flightMap.put("Bangkok", false);
                flightMap.put("Berlin", true);

                if (!flightMap.containsKey(flight.getArrivalAirport())){
                    throw new RouteNotFoundException(" airport doesn't exist.");
                }else {
                    System.out.println("Flight to " + flight.arrivalAirport + " is available.");
                }
        }

}
