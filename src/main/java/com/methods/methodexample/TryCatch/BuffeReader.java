/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author A-3
 */
public class BuffeReader {


    public static void main(String[] args) {
            try{
    BufferedReader reader = new BufferedReader(new FileReader("noneexists.txt"));
    
}catch(IOException e){
                System.out.println("IO Exceptions: " + e.getMessage());
}
    }
    

}
