package com.codingnomads.part_03;

import java.util.Scanner;

class Exercise_06 {

    //Bali Timezone GMT + 8

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        long timeZoneChange = input.nextInt();

        long totalMilliseconds = 0;

        if (timeZoneChange < 0 && timeZoneChange > -12) {
            totalMilliseconds = System.currentTimeMillis() - (timeZoneChange * 3600) * 1000;
        } else if (timeZoneChange >= 0 && timeZoneChange <= 12) {
            totalMilliseconds = System.currentTimeMillis() + (timeZoneChange * 3600) * 1000;
        } else {
            System.out.println("Invalid Time Zone - Try Again!");
        }

        printTime(totalMilliseconds);

    }

    public static void printTime(long milli) {

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = milli / 1000;

        // Get the current second within the minute within the hour
        long secondWithinTheHour = totalSeconds % 60 % 60;

        // Get total minutes
        long totalMinutes = totalSeconds / 60;

        // Get the current minute in the hour
        long minuteWithinTheHour = totalMinutes % 60;

        // Get the total hours
        long totalHours = totalMinutes / 60;

        // Get the current hour
        long currentHour = totalHours % 60;

        // Display results using a 12 hour clock, include AM or PM

        String formattedTime = String.format("%02d", currentHour) + ":" + String.format("%02d", minuteWithinTheHour)
                + ":" + String.format("%02d", secondWithinTheHour);

        System.out.println(formattedTime);

    }
}
