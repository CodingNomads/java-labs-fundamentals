package com.codingnomads.part_06.Exercises_1To5;

public class Book {

    private boolean available;
    private int daysAvailable;
    int pages;
    String genre;
    String title;

    public Book(){
    }

    public Book(boolean available, int daysAvailable) {
        this.available = available;
        this.daysAvailable = daysAvailable;
    }

    public String setTitle(String title){
        return title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getDaysAvailable() {
        return daysAvailable;
    }

    public void setDaysAvailable(int daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
}
