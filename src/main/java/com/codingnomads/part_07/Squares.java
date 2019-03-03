package com.codingnomads.part_07;

public class Squares extends Rectangles{

    private double length;

    public Squares(double length) {
        this.length = length;
    }

    @Override
    public double calcPerimeter(double length){
        this.length = length;
        return super.perimeter = length * 2;
    }

    @Override
    public double calcArea(double length) {
        this.length = length;
        return super.area = length * length;
    }

    @Override
    public String toString() {
        return "Squares{" +
                "length=" + length +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", hasColor=" + hasColor +
                '}';
    }
}
