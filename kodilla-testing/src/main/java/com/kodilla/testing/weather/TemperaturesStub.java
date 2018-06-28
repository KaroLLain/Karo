package com.kodilla.testing.weather;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {

    @Override
    public HashMap<Integer, Double> getTemperatures(){
        HashMap<Integer,Double> stubResult = new HashMap<>();

        //Dummy data

        stubResult.put(12,12.4);
        stubResult.put(13, 13.3);
        stubResult.put(14, 14.4);
        stubResult.put(15, 15.5);
        stubResult.put(16, 12.8);

        return stubResult;
    }
}
