/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.PrimitiveDataObject;

import java.net.Socket;

/**
 *
 * @author A-3
 */

public class Example {
    public static void main(String[] args) {
        Integer num = 500000000;
        Double dnum = 50.0;
        
        Long val = (long)num*99999999;
        
        Long val2 = num.longValue();
        val2 = val2 * 99;
        
        
        System.out.println(val+"\n"+ val2);
        
        System.out.println(CharArray);
        
        
       
}
    
     static String message = "Welcome to Java";
     
     static char[] CharArray = message.toCharArray();
     
     
   
}