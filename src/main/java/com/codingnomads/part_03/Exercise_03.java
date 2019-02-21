package com.codingnomads.part_03;


/**
 * Implement the getMonthName() method
 */

class Exercise_03 {

    public static void main(String[] strings) {


        // use a for loop to iterate 1000 times
        for (int i = 0; i < 1000; i++) {

            // Generate a random int between >= 1 and <= 12
            int month = 1 + (int) (Math.random() * ((12 - 1) + 1));

            // call getMonthName(int month) and pass your random int
            String monthName = getMonthName(month);

            // print the name of the month and the random int generated to the console
            System.out.println(month + " " + monthName);

        }

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {

        String monthName = "";

        // use a switch statement to determine the name of the month
        // for instance if the random int is 1 the name of month is January

        switch (month) {
            case 1 :
                return ("January");
            case 2 :
                return ("February");
            case 3 :
                return ("March");
            case 4 :
                return ("April");
            case 5 :
                return ("May");
            case 6 :
                return ("June");
            case 7 :
                return ("July");
            case 8 :
                return ("August");
            case 9 :
                return ("September");
            case 10 :
                return ("October");
            case 11 :
                return ("November");
            case 12 :
                return ("December");

        }

        return monthName;
    }
}





