package com.codingnomads.part_07;

import java.util.List;

public class Rectangles extends Shapes {

    private double width;
    private double length;

    Rectangles(){};

    public Rectangles(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcPerimeter(){
        double perimeter = (this.length + this.width) * 2;
        super.setPerimeter(perimeter);
        return perimeter;
    }


    @Override
    public double calcArea() {
        double area = this.width * this.length;
        super.setArea(area);
        return area;
    }


    @Override
    public String toString() {
        return "Rectangles{" +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + super.getPerimeter() +
                ", area=" + super.getArea() +
                ", hasColor=" + super.isHasColor() +
                '}';
    }
}
