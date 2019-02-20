package com.codingnomads.part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class Exercise02 {
    public static void main(String[] args) {

        int x = 5;
        int y = 12;
        int d = 45;
        int e = 32;

        int z = add(x, y);
        double zy = powerUp(d, e);

        System.out.println("The values added up are: " + z + zy);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double powerUp (int a, int b) {
        return Math.pow(a, b);
    }

}

