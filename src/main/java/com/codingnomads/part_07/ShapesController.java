package com.codingnomads.part_07;

public class ShapesController {

    public static void main(String[] args) {
        Rectangles rectangle = new Rectangles(2,4);
        rectangle.setHasColor(true);
        rectangle.calcArea();
        rectangle.calcPerimeter();
        System.out.println(rectangle.toString());

        Squares square = new Squares(2);
        square.setHasColor(false);
        square.calcArea();
        square.calcPerimeter();
        System.out.println(square.toString());


        Circles circle = new Circles(6);
        circle.setHasColor(false);
        circle.calcArea();
        circle.calcPerimeter();
        System.out.println(circle.toString());
    }
}
