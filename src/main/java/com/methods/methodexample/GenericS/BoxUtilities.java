/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.GenericS;

/**
 *
 * @author A-3
 */
public class BoxUtilities {
    public static <T> void printArray(T[] array){
        for (T item : array) {
            System.out.println(item + " ");
        }
        System.out.println("-----------");
    }
}
