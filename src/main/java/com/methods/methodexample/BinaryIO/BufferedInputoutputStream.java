/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinaryIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author A-3
 */
public class BufferedInputoutputStream {
    public static void main(String[] args) {
                   //Buffered read Strem faster read write
           
                      try {
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream("F:\\JAVA\\FileStreamOutput\\ph.jpg"));
            BufferedOutputStream fid = new BufferedOutputStream(new FileOutputStream("F:\\JAVA\\FileStreamOutput\\robiulpic.jpg"));
            byte[] buffer = new byte[1024];
            int bytesReads;
            while ((bytesReads = fis.read(buffer)) != -1) {
                fid.write(buffer, 0 , bytesReads);
               
                  
            }   
             fid.close();
             fis.close();
               System.out.println("Image Copied Your Folder");
        } catch (Exception e) {
               System.out.println("Error Copying file: "+ e.getMessage());
        }
    }
}
