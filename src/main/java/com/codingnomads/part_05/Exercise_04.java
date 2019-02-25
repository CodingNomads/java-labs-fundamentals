package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Sample{
    public static void main(String[] args) {

        Date date1 = new Date(2019);
        System.out.println(date1.toString());

        Date date2 = new Date("February", 2019);
        System.out.println(date2.toString());

        Date date3 = new Date(24,"February", 2019);
        System.out.println(date3.toString());

        Date date4 = new Date(24,"February", 2019, 17,45);
        System.out.println(date4.toString());
    }
}

class Date{
    private int day;
    private String month;
    private int year;
    private int hour;
    private int minute;


    Date(int year){
        this.year = year;
    }

    Date(String month, int year){
        this.month = month;
        this.year = year;
    }

    Date (int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Date(int day, String month, int year, int hour, int minute){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year + "/" + hour + ":" + minute;
    }
}