package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(5.5, average, 0.1);

    }
}
