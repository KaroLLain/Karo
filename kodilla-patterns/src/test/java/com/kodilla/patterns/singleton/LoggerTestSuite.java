package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest(){
        //Given
        String log1 = "Last log 1.";
        String log2 = "Last log 2.";
        //When
        Logger.getInstance().log(log1);
        Logger.getInstance().log(log2);
        //Then
        Assert.assertEquals(log2,Logger.getInstance().getLastLog());
    }
}
