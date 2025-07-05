/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinaryIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author A-3
 */
public class NIO {
    public static void main(String[] args) {
        Path fileOldPath =  Paths.get("C:\\Users\\A-3\\Downloads\\Postman-win64-Setup.exe");
        Path fileNewPath = Paths.get("F:\\JAVA\\FileStreamOutput\\Postman-win64-Setup.exe");
        
        try {
            Files.createDirectories(fileNewPath.getParent());
            Files.copy(fileOldPath, fileNewPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image Copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
