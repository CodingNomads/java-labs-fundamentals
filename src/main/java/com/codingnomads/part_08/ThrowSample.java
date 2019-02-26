package com.codingnomads.part_08;

import java.util.Scanner;

public class ThrowSample {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Date date = new Date();

        try{
            System.out.println("Enter Day");
            int day = keyboard.nextInt();
            date.setDay(day);

            System.out.println("Enter Month");
            int month = keyboard.nextInt();
            date.setMonth(month);

            System.out.println("Enter Year");
            int year = keyboard.nextInt();
            date.setYear(year);

        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }

        System.out.println(date.toString());
    }
}

class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws NumberFormatException{

        try{
            if(day <= 0 || day > 31)
                throw new NumberFormatException();

            this.day = day;
        }
        catch (NumberFormatException ex){
            System.out.println("Invalid Date");
            throw ex;
        }

    }

    public void setYear(int year)throws NumberFormatException {

        try{
            if(year < 1900 || year >= 3000)
                throw new NumberFormatException();

            this.year = year;
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid Year");
            throw ex;
        }

    }

    public void setMonth(int month) throws NumberFormatException {

        try{
            if(month <= 0 || month > 12)
                throw new NumberFormatException();

            this.month = month;
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid Month");
            throw ex;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}