package com.codingnomads.part_03;


import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        while(timeZoneChange < -11 || timeZoneChange > 12){
            System.out.println("Enter Valid Time Zone Offset -11 to +12");
            timeZoneChange = input.nextInt();
        }

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        int totalSeconds = (int)(totalMilliseconds / (1000));
        int totalMinutes = totalSeconds / 60;
        int totalHours = totalMinutes / 60;

        int currentHour = ((int)timeZoneChange + totalHours) % 24;
        int currenMinute = totalMinutes % 60;
        int currentSecond = totalSeconds % 60;

        String am_pm = "";

        if (currentHour >= 0 && currentHour < 12)
            am_pm = "AM";
        else if (currentHour == 12 && currenMinute == 0)
            am_pm = "AM";
        else
            am_pm = "PM";

        currentHour = currentHour == 0 || currentHour == 12 ? 12 : currentHour % 12;


        System.out.printf("Current Time: %02d:%02d:%02d %s", currentHour,currenMinute,currentSecond, am_pm);



        // Get total seconds since midnight, 1/1/1970

        // Get the current second within the minute within the hour

        // Get total minutes

        // Get the current minute in the hour

        // Get the total hours

        // Get the current hour

        // Display results using a 12 hour clock, include AM or PM

    }
}
