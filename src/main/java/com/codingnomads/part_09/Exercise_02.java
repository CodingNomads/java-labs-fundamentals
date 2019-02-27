package com.codingnomads.part_09;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections
 */

public class Exercise_02 {

    public static void main(String[] args) {
        File file = new File("filesforcopying/file_02.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, bytesRead));
            }

            }catch(IOException e){
                e.toString();
        }finally {
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
