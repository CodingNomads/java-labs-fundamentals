package com.codingnomads.part_07;

public class Shapes implements ShapesCalculator{

    //todo what is the purpose of having private variables?
    double perimeter;
    double area;
    boolean hasColor;

    public boolean isHasColor() {
        return hasColor;
    }

    public void setHasColor(boolean hasColor) {
        this.hasColor = hasColor;
    }

    public double calcArea(double area){
        return this.area;
    }

    public double calcPerimeter(double perimeter){
        return this.perimeter;
    }
}
