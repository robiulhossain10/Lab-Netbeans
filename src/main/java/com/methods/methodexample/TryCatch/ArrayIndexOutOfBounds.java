/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TryCatch;

/**
 *
 * @author A-3
 */
public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        defination("Robiul");
    }
    
    static void Exceptions(){
    try{
    int [] arr = new int[3];
            System.out.println(arr[5]);
}catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
            
}
    }
    
    static void defination(String name){
        Exceptions();
        System.out.println("My name is " + name);
    }
}
