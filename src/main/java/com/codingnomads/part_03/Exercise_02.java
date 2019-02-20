package com.codingnomads.part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */


class Returners {

    public static void main(String[] args) {

        Returners returner1 = new Returners();

        int multi = returner1.multiply(5, 8);
        int divi = returner1.divide(9, 3);

        int unite = multi + divi;

        System.out.println(unite);
    }

    private int multiply(int a, int b){
        return a * b;

    }

    private int divide(int a, int b){
        return a/b;

    }

}