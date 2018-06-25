package com.kodilla.testing.Shape;

import org.junit.*;
import com.kodilla.testing.Shape.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Prepare to executing test #" + testCounter);

    }

    @Test
    public void testAddFigure(){
        //Given
        shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        Shape square = new Square(3.25);
        Shape triangle = new Triangle(3.21, 3.25);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(circle , shapeCollector.getFigure(0));

    }

    @Test
    public void testRemoveFigure(){
        //Given
        shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        Shape square = new Square(3.25);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
    }


    @Test
    public void testShowFigures(){
        //Given
        shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        Shape square = new Square(3.25);
        Shape triangle = new Triangle(3.21, 3.25);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        Shape sqare1 = shapeCollector.getFigure(1);

        //Then

        Assert.assertEquals(square, sqare1);
    }
}
