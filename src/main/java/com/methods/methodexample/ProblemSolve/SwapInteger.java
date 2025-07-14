/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author A-3
 */
public class SwapInteger {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        
//        System.out.print("a:" + a);
//        System.out.print(" b:" + b);
//        System.out.println("");

int a = 123456789;

        while (a != 0) {            
            int val = a%10;
            System.out.print(" "  + val);
            a = a/10;
        }

        
//        int x = 250075;
//        
//        reverse(x);
        
        
      
        
        
        
        
    }
    
    private static void reverse(int a){
        if (a == 0) {
            return;
        }
        
        int val = a % 10;
        System.out.print(" " + val);
        val = a/10;
        
        reverse(val);
        
    }
   
}
