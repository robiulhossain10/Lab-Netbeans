/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TextIOEX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class TextIO {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Name");
//        String name = input.nextLine();
//        System.out.println("Enter Your Age");
//        int age = input.nextInt();
        
        //Output To File
        
        try{
            FileWriter write = new FileWriter("C:\\Users\\A-3\\Desktop\\MyData.txt");
            write.write("Hello Robiul!!!\n");
            write.write("Welcome to Java Text I/O\n");
            write.write("Rakib is a bad boy");
//            write.write("Age: " + age);
            
            write.close();
            System.out.println("Data has been written to output.txt");
        }catch(Exception e){
            System.out.println("Written to file Succesfully");
        }

        
                
    }
}
