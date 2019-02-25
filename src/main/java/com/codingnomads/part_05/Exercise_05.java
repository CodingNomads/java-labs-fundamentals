package com.codingnomads.part_05;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */

class RecursiveSample{
    public static void main(String[] args) {

        recursion(10);

    }

    public static void recursion(int val){
        if(val == 1) {
            System.out.println("Hello Recursion");
        }

        else {
            System.out.println("Hello Recursion");
            recursion(val - 1);
        }
    }
}
