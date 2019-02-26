package com.codingnomads.part_06;

public class TwoDShape extends Shape {

    private double width;
    private double height;

    // Default Constructor

    public TwoDShape() {
    }

    // Parameterised Constructor
    public TwoDShape(String name, double width, double height) {
        super(name); // Demonstrating use of the super keyword
        this.width = width;
        this.height = height;
    }

    // Getters

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    // Setters

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods

    void showDimensions() {
        System.out.println("The dimensions of your " + getName() + " are: " + "\n" + "Width: " + width + "\n" + "Height: " + height);
    }

    void dnc() {
        System.out.println("Running out of imagination in TwoDShape Class");
    }
}
