package com.codingnomads.part_07;

public class Circles extends Shapes {

    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea(double radius){
        this.radius = radius;
        return radius * radius * Math.PI;
    }

    @Override
    public double calcPerimeter(double radius){
        this.radius = radius;
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circles{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", hasColor=" + hasColor +
                '}';
    }
}
