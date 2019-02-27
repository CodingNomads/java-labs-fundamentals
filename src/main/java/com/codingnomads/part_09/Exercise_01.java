package com.codingnomads.part_09;

import java.io.*;

/**
 * Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 * Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01 {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        File file1 = new File("/Users/alpdurmaz/Documents/CodingNomads/course_java_fundamentals/course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise1Text1");
        File file2 = new File("/Users/alpdurmaz/Documents/CodingNomads/course_java_fundamentals/course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise1Text2");

        try{
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int cursor;

            do{
                cursor = bufferedInputStream.read();

                if(cursor == (int)' '){
                    cursor = (int)'-';
                }

                bufferedOutputStream.write(cursor);

            }while(cursor != -1);
        }
        catch(IOException ex){
            System.out.println("Failed");
            ex.printStackTrace();
        }

        finally {
            bufferedInputStream.close();
            bufferedOutputStream.close();

        }

        //READING AFTER CHANGES

        try{
            FileInputStream fileInputStream = new FileInputStream(file2);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int cursor;

            while((cursor = bufferedInputStream.read()) != -1){
                System.out.print((char)cursor);
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            bufferedInputStream.close();
        }
    }

}