package com.codingnomads.part_07;

/*
Create the following:

1) Write one super class with at least 3 private instance variables and at least 3 public methods
2) Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
extend another subclass which extends the super class. Each subclass should only have variables and methods
that apply to that subclass, ie Animal -> Mammal -> Whale.
3) Make use of the keyword "super" in at least two constructors.
4) Write an interface with at least 3 methods. Have the superclass implement this interface.
*/


class Food implements HumanEdible {
    private String name;
    private boolean isHot;
    private int calories;
    private double price;

    @Override
    public void washItem(Food food) {
        System.out.println("Washing " + food.getName());
    }

    @Override
    public void cleanItemFromDirt(Food food) {
        System.out.println("Cleaning " + food.getName());
    }

    @Override
    public void coverAgainstFlies(Food food) {
        System.out.println("Covering " + food.getName());
    }

    public void cookFood() {
        System.out.println("Cooking food...");
    }

    public void buyFood() {
        System.out.println("Shopping for food...");
    }

    public void consumeFood() {
        System.out.println("Eating good old food...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Pizza extends Food {

    public Pizza() {
        super.setCalories(2000);
    }

    void putSauceOnPizza() {
        System.out.println("Putting tomato sauce on pizza...");
    }

    void slicePepperoni() {
        System.out.println("Slicing pepperoni for pizza...");
    }

    void elevateCheeseness() {
        System.out.println("Elevating cheeseness of pizza...");
    }
}

class Dough extends Pizza {

    public Dough() {
        super.setPrice(10);
    }

    void mixFlour() {
        System.out.println("Mixing flour for dough...");
    }

    void massageDough() {
        System.out.println("Massaging dough for preparation...");
    }

    void letItRise() {
        System.out.println("Letting the dough rise nice and smoothly...");
    }
}
