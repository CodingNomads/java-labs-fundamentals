package com.codingnomads.part_09;

import java.io.*;

/**
 * Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections
 */

public class Exercise_02 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        File file = new File("/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/input");

        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            while (bufferedInputStream.read() != -1) {
                System.out.println(bufferedInputStream.read());
            }

        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }

}
