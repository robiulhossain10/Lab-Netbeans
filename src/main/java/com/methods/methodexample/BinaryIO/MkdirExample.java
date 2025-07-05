/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinaryIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author A-3
 */

// Save file Into new Directory

public class MkdirExample {
    public static void main(String[] args) {
        try {
            File input = new File("F:\\JAVA\\FileStreamOutput\\ph.jpg");
            File output = new File("F:\\JAVA\\FileStreamOutput\\Test\\Photo\\ph3.jpg");
            
            if(!output.exists()){
                output.getParentFile().mkdirs();
                output.createNewFile();
            }
            
            FileInputStream fis = new FileInputStream(input);
            FileOutputStream fos = new FileOutputStream(output);
            
            byte[] buffer = new byte[1024];
            int bytesReads;
            while ((bytesReads = fis.read(buffer)) != -1) {
                fos.write(buffer, 0 , bytesReads);
               
                
            }
             fis.close();
             fos.close();
               System.out.println("Image Copied Your Folder");
        } catch (Exception e) {
            System.out.println("Exceptions: " + e.getMessage());
        }finally{
            System.out.println("This Code Run Goods");
        }
    }
    
}
