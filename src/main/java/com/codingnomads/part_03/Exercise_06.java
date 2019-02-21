package com.codingnomads.part_03;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = (timeZoneChange * 60 * 60 ) + (System.currentTimeMillis()/1000);

        // Get the current second within the minute within the hour
        long second = totalSeconds % (60);

        // Get total minutes

        long totalMinutes = (timeZoneChange * 60) + (System.currentTimeMillis()/(1000 * 60));

        // Get the current minute in the hour

        long minute = totalMinutes % (60);

        // Get the total hours

        long totalHours = (timeZoneChange) + (System.currentTimeMillis() / (1000 * 60 * 60));

        // Get the current hour

        long hour = totalHours % (24);

        // Display results using a 12 hour clock, include AM or PM

        String morningOrNight = "";
        if (hour >= 12) {
            morningOrNight = "PM";
        } else {
            morningOrNight = "AM";
        }


        System.out.println("The time is: ");
        System.out.println(hour + ":" + minute + ":" + second + " " + morningOrNight);

    }
// Method to determine day name (not yet finished)
/*private String DayName (int i) {
    switch (i) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "error";
    }
    }*/
}
