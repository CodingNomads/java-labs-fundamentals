package com.codingnomads.part_07;

public class Circles extends Shapes {

    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        super.setArea(radius * radius * Math.PI);
        return radius * radius * Math.PI;
    }

    @Override
    public double calcPerimeter(){
        double perimeter = 2 * radius * Math.PI;
        super.setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circles{" +
                "radius=" + radius +
                ", perimeter=" + super.getPerimeter() +
                ", area=" + super.getArea() +
                ", hasColor=" + super.isHasColor() +
                '}';
    }
}
