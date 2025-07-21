/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author A-3
 */
public class NIOFiles {
    public static void main(String[] args) {
        Path fileOlPath = Paths.get("F:\\JAVA\\ROBIUL\\nio.txt");
        Path fileNewPath = Paths.get("F:\\JAVA\\ROBIUL\\rakib.txt");
        
        try {
            Files.createDirectories(fileNewPath.getParent());
            Files.copy(fileOlPath, fileNewPath,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
