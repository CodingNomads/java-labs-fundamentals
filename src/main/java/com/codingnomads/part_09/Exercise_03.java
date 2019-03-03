package com.codingnomads.part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
 * be sure to close all connections
 */

public class Exercise_03 {
    public static void main(String[] args) {
        int i;
        String s;

        try(BufferedReader br = new BufferedReader(new FileReader("filesforcopying/test_03.txt")))
        {
            //todo why does this ommit the first character??
            while ((i = br.read()) != -1) {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            }
            } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}
