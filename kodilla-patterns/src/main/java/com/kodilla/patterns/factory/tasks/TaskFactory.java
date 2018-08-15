package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "ShoppingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String DRIVING_TASK = "DrivingTask";

    public final Task makeTask(final String taskType) {

        switch (taskType){
            case SHOPPING_TASK:
                return new ShoppingTask("Visit Aldi", "Soy stake.", 10);
            case PAINTING_TASK:
                return new PaintingTask("Paint", "Pink", "Cup");
            case DRIVING_TASK:
                return new DrivingTask("Drive", "Berlin","Bike" );
            default:
                return null;
        }
    }
}
