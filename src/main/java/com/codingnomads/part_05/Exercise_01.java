package com.codingnomads.part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class SampleHouses{


    public static void main(String[] args) {
        NeighborhoodData vancouverHouses = new NeighborhoodData();
        vancouverHouses.setHouseType("Single family");
        vancouverHouses.setPrice(1000000);
        vancouverHouses.showNeighborhood();

    }
    
}

class NeighborhoodData{

    private String houseType;
    private int price;

    public void showNeighborhood() {
        CountryData canadianNeighborhood = new CountryData();
        canadianNeighborhood.setNeighborhood("Vancouver");
        canadianNeighborhood.setPopulation(631500);
        System.out.println(canadianNeighborhood);
    }

    public void setHouseType(String houseType){
        this.houseType = houseType;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "NeighborhoodData{" +
                "houseType='" + houseType + '\'' +
                ", price=" + price +
                '}';
    }
}

class CountryData{

    private int population;
    private String neighborhood;

    public void setPopulation(int population){
        this.population = population;
    }

    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "CountryData{" +
                "population=" + population +
                ", neighborhood='" + neighborhood + '\'' +
                '}';
    }


}