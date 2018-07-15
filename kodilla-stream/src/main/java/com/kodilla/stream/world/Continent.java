package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countries = new ArrayList<>();
    private final String continentName;


    public Continent(final String continentName){
        this.continentName = continentName;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public String getContinentName() {
        return continentName;
    }

    public boolean addCountry (Country country){
        return countries.add(country);
    }
}
