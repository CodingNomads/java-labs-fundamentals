package com.codingnomads.part_01;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;
import java.util.*;

/**
 * Part 1 Exercise 8:
 * <p>
 * Write the necessary code that prints out the area
 * and perimeter of a circle with a radius of 3.14
 */

public class Exercise_08 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter Radius For Calculating Area & Perimeter");
        int r = kb.nextInt();

        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;

        System.out.println("Area: " + area);
        System.out.println("Perimeter " + perimeter);

    }

}