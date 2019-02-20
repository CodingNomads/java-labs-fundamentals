package com.codingnomads.part_03;

import java.util.Scanner;

/* AM PM missing
ifs falls kleiner als 10 , 0 adden for design :P
für < > für AM PM   dann noch switch um umzuwandeln in 1-12 statt bis 24 !?
same time always timezone not working */


class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;

        // Get the current second within the minute within the hour

        long currentSecond = (totalSeconds % 3600) % 60;

        // Get total minutes

        long totalMinutesInSeconds = (totalSeconds % 3600) - currentSecond;

        // Get the current minute in the hour

        long currentMinute = totalMinutesInSeconds / 60;

        // Get the total hours

        long totalHoursInSeconds = (totalSeconds - totalMinutesInSeconds - currentSecond);

        // Get the current hour

        long currentHour = (totalSeconds - totalMinutesInSeconds - totalHoursInSeconds)/3600;


        String AMPM = "AM";


        // Display results using a 12 hour clock, include AM or PM
        System.out.println("      --------------------");
        System.out.println("     |"+ "\t\t\t \t \t |");
        System.out.println("     |  " + currentHour + " : " + currentMinute + " : " + currentSecond + " " + AMPM + "   |");
        System.out.println("     |" + "\t\t\t \t \t |");
        System.out.println("      --------------------");

    }
}

