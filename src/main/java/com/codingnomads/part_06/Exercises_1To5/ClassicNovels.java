package com.codingnomads.part_06.Exercises_1To5;

public class ClassicNovels extends Fiction{


    @Override
    public String setTitle(String title) {
        System.out.println(title + "is the title of this book.");
        return super.setTitle(title);
    }

    @Override
    public void setTotalCopies(int totalCopies) {
        if(totalCopies <= 5) {
            super.setTotalCopies(totalCopies);
        } else {
            System.out.println("Classics book only have a maximum of 5 copies");
        }
    }

}
