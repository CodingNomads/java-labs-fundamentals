package com.codingnomads.part_06.Exercises_1To5;

public class Fiction extends Book{

    private int totalCopies;

    public Fiction(){

    }

    public Fiction(boolean available, int daysAvailable, int totalCopies) {
        super(available, daysAvailable);
        this.totalCopies = totalCopies;

    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    String showGenre(){
        System.out.println("This is a fiction book.");
        return genre = "Fiction";
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}
