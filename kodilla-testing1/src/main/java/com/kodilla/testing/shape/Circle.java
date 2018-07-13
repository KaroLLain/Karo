package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int r ;

    public Circle(int r) {
        this.r = r;
    }

    public String getShapeName() {
        return  "Circle";
    }


    public Double getField() {
        return Math.PI*(r^2);
    }
}
