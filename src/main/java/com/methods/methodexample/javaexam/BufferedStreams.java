/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author A-3
 */
public class BufferedStreams {
    private static final String STUDENT_ID = "1287940";
    private static final String STUDENT_NAME = "Robiul Hossain";
    public static void main(String[] args) {
        try {
            File input = new File("F:\\JAVA\\BufferedStream\\bufferedstream.txt");
            File output = new File("F:\\JAVA\\BufferedStream\\newfile.txt");
            
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));
            
            
        } catch (Exception e) {
        }
    }
}
