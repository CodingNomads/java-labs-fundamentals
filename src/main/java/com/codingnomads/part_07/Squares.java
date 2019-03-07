package com.codingnomads.part_07;

public class Squares extends Rectangles{

    private double length;

    public Squares(double length) {
        this.length = length;
    }

    @Override
    public double calcPerimeter(){
        double perimeter = length * 2;
        super.setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public double calcArea() {
        double area = length * length;
        super.setArea(area);
        return area;
    }

    @Override
    public String toString() {
        return "Squares{" +
                "length=" + length +
                ", perimeter=" + super.getPerimeter() +
                ", area=" + super.getArea() +
                ", hasColor=" + super.isHasColor() +
                '}';
    }
}
