package com.codingnomads.part_09;

import java.io.*;

/**
 * Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections
 */

public class Exercise_02 {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/alpdurmaz/Documents/CodingNomads/course_java_fundamentals/course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise1Text1");

        BufferedInputStream bufferedInputStream = null;

        try{
            FileInputStream fileInputStream = new FileInputStream(file);

            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int cursor;

            do{
                cursor = bufferedInputStream.read();

                System.out.print((char)cursor);
            } while (cursor != -1);

        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        finally {
            bufferedInputStream.close();
        }
    }

}
