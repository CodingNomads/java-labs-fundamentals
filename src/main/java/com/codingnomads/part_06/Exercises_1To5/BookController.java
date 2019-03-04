package com.codingnomads.part_06.Exercises_1To5;

public class BookController {

    public static void main(String[] args) {
        Book SciFi = new Fiction(true,20,2);
        SciFi.setTitle("Fahrenheit 451");
        ((Fiction) SciFi).setPages(154);
        ((Fiction) SciFi).showGenre();
        System.out.println(SciFi.toString());

        Book historyBook = new NonFic(false,0,1,true);
        historyBook.setTitle("World History");
        ((NonFic) historyBook).setPages(359);
        ((NonFic) historyBook).showGenre();
        System.out.println(historyBook.toString());

    }
}
