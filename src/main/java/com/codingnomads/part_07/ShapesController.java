package com.codingnomads.part_07;

public class ShapesController {

    public static void main(String[] args) {
        Rectangles rectangle = new Rectangles(2,4);
        rectangle.setHasColor(true);
        rectangle.calcArea(2,4);
        rectangle.calcPerimeter(2,4);
        System.out.println(rectangle.toString());

        Squares square = new Squares(2);
        square.setHasColor(false);
        square.calcArea(2);
        square.calcPerimeter(2);
        System.out.println(square.toString());

        //todo perimeter and area aren't showing anything??
        Circles circle = new Circles(6);
        circle.setHasColor(false);
        circle.calcArea(6);
        circle.calcPerimeter(6);
        System.out.println(circle.toString());
    }
}
