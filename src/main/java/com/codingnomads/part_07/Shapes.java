package com.codingnomads.part_07;

public class Shapes implements ShapesCalculator{

    private double perimeter;
    private double area;
    private boolean hasColor;

    public boolean isHasColor() {
        return hasColor;
    }

    public void setHasColor(boolean hasColor) {
        this.hasColor = hasColor;
    }

    public double calcArea()
    {
        return this.area;
    }

    public double calcPerimeter()
    {
        return this.perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
