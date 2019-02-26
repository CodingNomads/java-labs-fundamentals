package com.codingnomads.part_06;

public class ThreeDShape extends Shape {

    // sub-class instance variables

    private double width;
    private double height;
    private double depth;

    // Default Constructor

    public ThreeDShape(){

    }

    // Default Constructor w/call to super

    public ThreeDShape(String name) {
        super(name);
    }

    // Parameterised Constructor

    public ThreeDShape(String name, double width, double height, double depth) {
        super(name);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Methods

    void dnc() {
        System.out.println("Running out of imagination in ThreeDShape");
    }
}
