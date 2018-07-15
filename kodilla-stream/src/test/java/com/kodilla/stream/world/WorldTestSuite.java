package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Australia");

        Country poland = new Country("Poland");
        Country makedonia = new Country("Makedonia");
        Country lagos = new Country("Lagos");
        Country kair = new Country("Kair");
        Country vietnam = new Country("Vietnam");
        Country laos = new Country("Laos");
        Country hungary = new Country("Hungary");
        Country nairobi = new Country("Nairobi");
        Country birma = new Country("Birma");


        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        europe.addCountry(poland);
        europe.addCountry(hungary);
        europe.addCountry(makedonia);

        africa.addCountry(lagos);
        africa.addCountry(kair);
        africa.addCountry(nairobi);

        asia.addCountry(laos);
        asia.addCountry(birma);
        asia.addCountry(vietnam);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("9999999");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
