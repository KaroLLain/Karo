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
        Continent asia = new Continent("Asia");

        Country poland = new Country("Poland");
        Country macedonia = new Country("Macedonia");
        Country lagos = new Country("Lagos");
        Country cairo = new Country("Cairo");
        Country vietnam = new Country("Vietnam");
        Country laos = new Country("Laos");
        Country hungary = new Country("Hungary");
        Country nairobi = new Country("Nairobi");
        Country burma = new Country("Burma");


        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        europe.addCountry(poland);
        europe.addCountry(hungary);
        europe.addCountry(macedonia);

        africa.addCountry(lagos);
        africa.addCountry(cairo);
        africa.addCountry(nairobi);

        asia.addCountry(laos);
        asia.addCountry(burma);
        asia.addCountry(vietnam);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then

        BigDecimal totalPeopleExpected = new BigDecimal("9999999");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
