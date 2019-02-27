package com.codingnomads.part_09;

import java.io.*;

/**
 * Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
 * be sure to close all connections
 */

public class Exercise_03 {
    public static void main(String[] args) {

        File file = new File("/Users/alpdurmaz/Documents/CodingNomads/course_java_fundamentals/course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise1Text1");
        BufferedReader bufferedReader = null;

        //read()
        try{
            FileReader fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);

            int cursor;

            do{
                cursor = bufferedReader.read();

                System.out.print((char)cursor);
            } while (cursor != -1);

        }
        catch(IOException ex){
            ex.printStackTrace();
        }

        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //readLine()
        try{

            FileReader fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);

            System.out.println(bufferedReader.readLine());

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
