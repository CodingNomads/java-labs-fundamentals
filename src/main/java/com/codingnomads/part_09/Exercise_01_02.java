package com.codingnomads.part_09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_01_02 {

        public static void main(String[] args) {

            try(
                    FileInputStream in = new FileInputStream("filesforcopying/testFile_2.txt");
                    FileOutputStream out = new FileOutputStream("filesforcopying/copiedFile_2.txt"))
            {
                int c;
                while(( c = in.read()) != -1) {
                    if (c == 32) c = 45;
                }
                out.write(c);
            }
            catch(IOException e){
                System.out.println(e.toString());

            }

        }
}

