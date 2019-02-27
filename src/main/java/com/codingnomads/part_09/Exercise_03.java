package com.codingnomads.part_09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
 * be sure to close all connections
 */

public class Exercise_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        File file = new File("/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/input");

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.read() != -1) {
                System.out.println(".readLine method: " + bufferedReader.readLine());
                System.out.println(".read method: " + bufferedReader.read());
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }

    }

}
