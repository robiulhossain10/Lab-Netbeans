/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinaryIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author A-3
 */
public class FileStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("F:\\JAVA\\FileStreamOutput\\FileOutput.txt");
            byte[] data = {65,66,67,68};
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        } finally{
            
        }
        
        
        
        //Read Write Image In java
        try {
            FileInputStream fis = new FileInputStream("F:\\JAVA\\FileStreamOutput\\ph.jpg");
            FileOutputStream fid = new FileOutputStream("F:\\JAVA\\FileStreamOutput\\abc.jpg");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
                fid.write((char) b);
               
                
            }
             fid.close();
             fis.close();
        } catch (Exception e) {
            
        }
        
        
        //File Stream Output Buffer Read Write
        
           try {
            FileInputStream fis = new FileInputStream("F:\\JAVA\\FileStreamOutput\\ph.jpg");
            FileOutputStream fid = new FileOutputStream("F:\\JAVA\\FileStreamOutput\\buffercopy2.jpg");
            byte[] buffer = new byte[1024];
            int bytesReads;
            while ((bytesReads = fis.read(buffer)) != -1) {
                fid.write(buffer, 0 , bytesReads);
               
                
            }
             fid.close();
             fis.close();
               System.out.println("Image Copied Your Folder");
        } catch (Exception e) {
               System.out.println("Exceptions"+ e.getMessage());
        }
           

    }
}
