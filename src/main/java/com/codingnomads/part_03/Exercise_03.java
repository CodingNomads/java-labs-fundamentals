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
        switch(month){
            case 1:
                System.out.print("January - ");
                break;

            case 2:
                System.out.print("February - ");
                break;

            case 3:
                System.out.print("March - ");
                break;

            case 4:
                System.out.print("April - ");
                break;

            case 5:
                System.out.print("May - ");
                break;

            case 6:
                System.out.print("June - ");
                break;

            case 7:
                System.out.print("July - ");
                break;

            case 8:
                System.out.print("August - ");
                break;

            case 9:
                System.out.print("September - ");
                break;

            case 10:
                System.out.print("October - ");
                break;

            case 11:
                System.out.print("November - ");
                break;

            default:
                System.out.print("December - ");
        }


        return monthName;
    }
}





