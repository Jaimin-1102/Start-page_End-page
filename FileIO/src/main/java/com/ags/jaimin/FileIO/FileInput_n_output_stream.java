package com.ags.jaimin.FileIO;

import java.io.*;

/**
 * Hello world!
 *
 */
public class FileInput_n_output_stream 
{
    public static void main( String[] args ) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("/home/jaiminrana/Desktop/MyJava.txt");
        
        String str = "Learn Java programming";
        
        byte b[] = str.getBytes();
        
//        for(byte x: b) {
//        	fos.write(x);
//        }
        
         fos.write(b,6,str.length());
        
//        fos.write(str.getBytes()); 
    }
}
