/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TryCatch;

/**
 *
 * @author A-3
 */
public class TryCatchs {
    public static void main(String[] args) {
        tryCatchExample(10,0);
    }
    
    static void tryCatchExample(int a, int b){
        try{
            int results = a/b;
            System.out.println("Results: " + results);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException" + e.getMessage());
        } finally{
            System.out.println("Finallllllllllllllllllllllly");
        }
    }
}
