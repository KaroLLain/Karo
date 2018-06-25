package com.kodilla.testing.Shape;

public class Triangle implements Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public Double getField() {

        return a*h/2;
    }
}
