package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return continents.add(continent);
    }

    public final BigDecimal getPeopleQuantity(){
        BigDecimal totalPeopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country)-> sum = sum.add(country));

        return totalPeopleQuantity;

    }
}
