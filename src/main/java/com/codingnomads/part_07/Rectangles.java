package com.codingnomads.part_07;

public class Rectangles extends Shapes {

    private double width;
    private double length;

    Rectangles(){};

    public Rectangles(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //todo should I make these methods public??
    //todo and do I need to use the keyword this here?
    double calcPerimeter(double width, double length){
        this.width = width;
        this.length = length;
        return super.perimeter = (width + length) * 2;
    }


    double calcArea(double width, double length) {
        this.width = width;
        this.length = length;
        return super.area = width * length;
    }


    @Override
    public String toString() {
        return "Rectangles{" +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", hasColor=" + hasColor +
                '}';
    }
}
