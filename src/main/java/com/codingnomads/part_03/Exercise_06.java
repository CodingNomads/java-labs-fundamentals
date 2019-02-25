package com.codingnomads.part_03;

import java.sql.Time;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        Calendar now = Calendar.getInstance();

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds / 1000;

        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds % 60;

        // Get total minutes
        long totalMinutes = totalSeconds / 60;

        // Get the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Get the total hours
        long totalHours = totalMinutes / 60;

        // Get the current hour
        long currentHour = (timeZoneChange + totalHours) % 24;

        // Display results using a 12 hour clock, include AM or PM
        String dayNotation;
        if(totalHours >= 12){
            dayNotation = "PM";
        } else {
            dayNotation = "AM";
        }

        System.out.println(currentHour + ":" + currentMinute +":" + currentSecond + " " + dayNotation);
    }
}
