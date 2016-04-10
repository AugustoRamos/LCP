package com.company;

import java.util.List;

/**
 * Created by augustochaves on 18/03/16.
 */
public class Country {

    private String Name;
    private String Capital;
    private Double Dimension;
    private List<Country> CountriesBordering;


    public Country(String name, String capital, Double dimension) {
        Name = name;
        Capital = capital;
        Dimension = dimension;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public Double getDimension() {
        return Dimension;
    }

    public void setDimension(Double dimension) {
        Dimension = dimension;
    }

    public boolean isEqual(String name, String capital){
        if(name == this.getName() && capital == this.getCapital())
            return true;
        else
            return false;
    }

    public void setCountryBorder(Country country){
        if(!isEqual(country.getName(), country.getCapital())){
            this.CountriesBordering.add(country);
            System.out.println("País adicionado com sucesso!");
        }
        else{
            System.out.println("País não adicionado, pois seu nome e sua capital são iguais ao do país atual!");
        }
    }

    public List<Country> getCountriesBordering(){
        return this.CountriesBordering;
    }

    public void getCommunCountriesBordering(Country country){

        for (Country c : country.getCountriesBordering()) {
            if (this.CountriesBordering.contains(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}
