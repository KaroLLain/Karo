package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {

    private int flightNumber;
    private final String departure;
    private String destination;

    public Flight(int flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }
    public String getDestination() {
        return destination;
    }
    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber &&
                Objects.equals(departure, flight.departure) &&
                Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightNumber, departure, destination);
    }

    @Override
    public String toString() {
        return   departure +
                ", destination: " + destination +
                ", flight number: " + flightNumber;
    }
}
