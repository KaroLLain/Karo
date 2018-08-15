package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Visit Aldi", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Then
        Assert.assertEquals(true, painting.isTaskExecuted() );
        Assert.assertEquals("Paint", painting.getTaskName());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        Assert.assertEquals(true, driving.isTaskExecuted() );
        Assert.assertEquals("Drive", driving.getTaskName());
    }
}
