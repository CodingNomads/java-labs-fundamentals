package com.codingnomads.part_06.Exercises_1To5;

public class NonFic extends Book {

    private int totalCopies;
    private boolean isNew;

    public NonFic(boolean available, int daysAvailable, int totalCopies, boolean isNew) {
        super(available, daysAvailable);
        this.totalCopies = totalCopies;
        this.isNew = isNew;

    }

    String showGenre(){
        System.out.println("This is a non-fiction book");
        return genre = "Non-fiction";
    }

    @Override
    public String toString() {
        return "Non-Fiction{" +
                "pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}
