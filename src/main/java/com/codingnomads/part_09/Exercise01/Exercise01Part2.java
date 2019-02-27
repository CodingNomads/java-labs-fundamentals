package com.codingnomads.part_09.Exercise01;

import java.io.*;

/**
 * 8. Rewrite the program described in question 7 so that it uses the character stream classes.
 * This time, use the try-with-resources statement to automatically close the file.
 */

public class Exercise01Part2 {
    public static void main(String[] args) {

        String inputFilePath = "/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/inputwithresources";
        String outputFilePath = "/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/outputwithresources";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));
            String line;

            while (br.read() != -1) {
                line = br.readLine();
                bw.write(line.replace(" ", "-"));
            }
        } catch (IOException exc) {
            System.out.println("Exception!");
        }
    }
}
