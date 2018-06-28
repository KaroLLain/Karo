package com.kodilla.testing.Weather;

import java.util.HashMap;

public interface Temperatures {

    //first element on the map is an identifier of weather station
    //second element on the map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();

}
