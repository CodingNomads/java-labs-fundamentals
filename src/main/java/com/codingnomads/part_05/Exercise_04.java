package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Exercise_04 {
    public static void main(String[] args) {

        Liquid water = new Liquid();
        water.setName("Dirty Water");
        System.out.println(water.toString());
        System.out.println();

        Liquid hotWater = new Liquid(48);
        hotWater.setTemperature(99);
        System.out.println(hotWater.toString());
        System.out.println();

        Liquid rum = new Liquid("Rum");
        rum.setColor("transparent");
        System.out.println(rum.toString());

    }
}

class Liquid {

    private double temperature;
    private String name;
    private String color;

    public Liquid () {

        System.out.println("No parameters likely means this is old plain water");

        setName("Water");
        setColor("Translucent");
        setTemperature(10);

        System.out.println("This is " + getName() + " with a " + getColor() + " color and it is " + getTemperature() +
                " degrees");
    }

    public Liquid (double temperature) {

        System.out.println("You have defined temperature");

        setName("Water");
        setColor("Translucent");
        setTemperature(temperature);

        System.out.println("This is " + getName() + " with a " + getColor() + " color and it is " + getTemperature() +
                " degrees");

    }

    public Liquid (String name) {

        System.out.println("Thank you for telling me what this liquid is...");

        setName(name);
        setColor("Gold");
        setTemperature(10);

        System.out.println("This is " + getName() + " with a " + getColor() + " color and it is " + getTemperature() +
                " degrees");

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}