package com.kodilla.testing.Weather.Stub;

import com.kodilla.testing.Weather.Temperatures;
import com.kodilla.testing.Weather.TemperaturesStub;
import com.kodilla.testing.Weather.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForceast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForceast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);

    }
}
