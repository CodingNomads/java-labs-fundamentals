package com.codingnomads.part_09.Exercise01;

import java.io.*;

/**
 * Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 *
 * Write a program that copies a text file. In the process, have it convert all spaces into hyphens.
 * Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close( ).
 *
 */
public class Exercise_01 {
    public static void main(String[] args) throws Exception {

        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        String inputFilePath = "/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/input";
        String outputFilePath = "/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/output";

        try {
            inputStream = new BufferedReader(new FileReader(inputFilePath));
            outputStream = new BufferedWriter(new FileWriter(outputFilePath));
            String line;

            while (inputStream.read() != -1) {
                line = inputStream.readLine();
                outputStream.write(line.replace(" ","-"));

            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}