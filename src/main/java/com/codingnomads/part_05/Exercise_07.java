package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Exercise_07 {
    public static void main(String[] args) {

        City.setPlanet("Jupiter");

        City denpansar = new City();
        denpansar.setName("Denpansar");
        denpansar.setMedianIncome(9854);
        denpansar.setPopulation(1000000);

        City toronto = new City();
        toronto.setName("Toronto");
        toronto.setMedianIncome(56000);
        toronto.setPopulation(2900000);

        City barcelona = new City();
        barcelona.setName("Barcelona");
        barcelona.setMedianIncome(59000);
        barcelona.setPopulation(5000000);

        System.out.println(denpansar.toString());
        System.out.println();
        System.out.println(toronto.toString());
        System.out.println();
        System.out.println(barcelona.toString());

    }
}

class City {

    private static String planet = "Earth";
    private double medianIncome;
    private String name;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getMedianIncome() {
        return medianIncome;
    }

    public void setMedianIncome(double medianIncome) {
        this.medianIncome = medianIncome;
    }

    public static void setPlanet(String planet) {
        City.planet = planet;
    }

    @Override
    public String toString() {
        return "City{" +
                "medianIncome=" + medianIncome +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", planet=" + planet +
                '}';
    }
}