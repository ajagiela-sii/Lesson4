package org.example;

import java.util.List;

public class Market {
    private final List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void printCountryList() {
        System.out.println("Market: " + getCountries().stream().map(country -> country.getCountryName() + " - " + country.getCountrySign()).toList());
    }
}
