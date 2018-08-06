package com.kodilla.spring.intro.shape;

import org.junit.Test;
import shape.Drawer;

public class DrawerTestSuite {

    @Test
    public void testDoDrawing(){

        //Given
        Drawer drawer = new Drawer();

        //When
        drawer.doDrawing();

        //Then
        //do nothing
    }
}
