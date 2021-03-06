package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> shapeCollector = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeCollector.contains(shape)) {
            shapeCollector.remove(shape);
            result = true ;
        }
        return result;
    }
    public Shape getFigure(int n){
        return shapeCollector.get(n);

    }

}
