package com.kodilla.testing.Weather.Mock;
import com.kodilla.testing.Weather.WeatherForecast;
import com.kodilla.testing.Weather.Temperatures;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithMock(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        HashMap<Integer, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put(12,12.4);
            temperaturesMap.put(13, 13.3);
            temperaturesMap.put(14, 14.4);
            temperaturesMap.put(15, 15.5);
            temperaturesMap.put(16, 12.8);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);


    }
}