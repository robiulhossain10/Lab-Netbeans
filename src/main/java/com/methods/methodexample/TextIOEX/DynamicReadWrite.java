/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TextIOEX;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;

/**
 *
 * @author A-3
 */
public class DynamicReadWrite {
    
    public static void main(String[] args) {
        
        try {
            
            FileReader reading = new FileReader("C:\\Users\\A-3\\Desktop\\reads.txt");
            FileWriter write = new FileWriter("C:\\Users\\A-3\\Desktop\\reads2.txt");
            
            int Character ;
            while((Character = reading.read()) != -1){
            
                write.write((char)Character);
            
            }
            write.close();
            
            
            
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
    }
    
}
