package com.codingnomads.part_06;

public class Shape {

    private String name; // Private Instance Variable

    // Default Constructor

    public Shape() {
    }

    // Parameterised Constructor
    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Methods
    void showName() {
        System.out.println("The name of the object created is: " + name);
    }
    // Method to return area based on string name given to object passed in.
    double area(TwoDShape obj) {
        double sum, w, h;
        sum = 0;
        w = obj.getWidth();
        h = obj.getHeight();

        switch (obj.getName()) {
            case ("Triangle") :
                sum = w * h * 0.5;
                break;
            case("Square") :
                sum = w * h;
                break;
            case("Rectangle") :
                sum = w * h;
                break;
            case("Circle") :
                sum = Math.PI * Math.pow((w * 0.5),2);
                break;
        }
        return sum;
    }
    // as above but to give the perimeter

    double perimeter(TwoDShape obj) {
        double perimeter, w, h;
        perimeter = 0;
        w = obj.getWidth();
        h = obj.getHeight();

        switch (obj.getName()) {
            case ("Triangle") :
                perimeter = 6 * h / Math.sqrt(3);
                break;
            case("Square") :
                perimeter = (4 * w);
                break;
            case("Rectangle") :
                perimeter = (2 * w) + (2 * h);
                break;
            case("Circle") :
                perimeter = 2 * Math.PI * (w * 0.5);
                break;
        }
        return perimeter;
    }

    void dnc(){
        System.out.println("Running out of imagination in Shape");
    }
}

class Controller {
    public static void main(String[] args) {
        TwoDShape twoDShape1 = new TwoDShape(); // Creating object of sub-class
        twoDShape1.setName("Square"); // Assigning name to superclass
        twoDShape1.showName(); // Demonstrating name being assigned.

        ThreeDShape threeDShape1 = new ThreeDShape(); // as above
        threeDShape1.setName("Cuboid");
        threeDShape1.showName();

        Triangle triangle = new Triangle(); // Creating object of sub-class
        triangle.setName("Triangle");
        triangle.setHeight(10.0);
        triangle.setWidth(10.0);
        triangle.showDimensions(); // Demonstrating that level 2 sub-class can assign values to level 1 subclass and level 0 parent class & calling overriden method.

        System.out.println("Area is: " + triangle.area(triangle)); // Calling methods of superclass by passing object of subclass in
        System.out.println("Perimeter is: " + triangle.perimeter(triangle));

        Triangle triangle1 = new Triangle("Triangle",3,5); // Demonstrating overloaded constructors in subclass
        Triangle triangle2 = new Triangle("Triangle",25,100,"Solid","blue");

        Shape shape = new Shape(); // overloaded constructors in superclass
        Shape shape1 = new Shape("Sphere");

        twoDShape1.setWidth(10);
        twoDShape1.setHeight(10);
        twoDShape1.showDimensions();
        System.out.println("This is called from the non-overriden method"); // calling non-overriden method

        // Dynamic Method Dispatch

        shape.dnc();
        threeDShape1.dnc();
        twoDShape1.dnc();
    }
}
