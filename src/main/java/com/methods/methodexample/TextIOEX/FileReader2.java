/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TextIOEX;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class FileReader2 {

    public FileReader2(String cUsersA3Desktopreadstxt) {
    }
    public static void main(String[] args) {
        //--------------Readable-------------------------
        
                try{
            File file = new File("C:\\Users\\A-3\\Desktop\\MyData.txt");
            Scanner fileScanner = new Scanner(file);
                    System.out.println("\nReading form output.txt");
                    while (fileScanner.hasNext()) {
                        System.out.println(fileScanner.nextLine());
                        
                    }
            
            fileScanner.close();
            System.out.println("Data has been written to output.txt");
        }catch(FileNotFoundException e){
                    System.out.println("Error");
        }
    }

//    int read() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

 
 


}
