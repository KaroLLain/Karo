package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test List: Begin");
    }
    @After
    public void after(){
        System.out.println("Test List: End");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {


        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assert.assertEquals(0, resultList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        //When
        ArrayList<Integer> evenNumber = oddNumbersExterminator.exterminate(normalList);

        //Then
        Assert.assertEquals(3, evenNumber.size());
    }
}
