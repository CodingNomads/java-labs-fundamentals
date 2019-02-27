package com.codingnomads.part_09;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 * 7. Write a program that copies a text file. In the process, have it convert all spaces into hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close( ).
 * 8. Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the try-with-resources statement to automatically close the file.
 * Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01 {

    public static void main(String[] args) throws IOException{

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("filesforcopying/testFile.txt");
            out = new FileOutputStream("filesforcopying/copiedFile.txt");
            int c;

            while((c = in.read()) != -1){
                if(c == 32) {
                    c = 45;
                }
                out.write(c);
            }
        } finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }

    }

}


