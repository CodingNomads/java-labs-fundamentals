package com.codingnomads.part_06;

public class Triangle extends TwoDShape {

    String style; // sub-class instance variables
    String colour;
    // Default Constructor

    public Triangle(){

    }

    // Default Constructor w/call to super

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    // Parameterised Constructor

    public Triangle(String name, double width, double height, String style, String colour) {
        super(name, width, height);
        this.style = style;
        this.colour = colour;
    }

    // Overriden Methods


    @Override
    void showDimensions() {
        super.showDimensions();
        System.out.println("This is the overriden method");
    }
}
