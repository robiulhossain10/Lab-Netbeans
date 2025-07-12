/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author A-3
 */
public class StringArray {
    public static void main(String[] args) {
        StringArr();
    }
    
    public static void StringArr(){
        String [] fruits = {"Apple","Mango","Cherry","MintApple","Orange"};
        System.out.println("Fruits List: ");
//        for(String fruit : fruits){
//            System.out.print( fruit + " ");
//        }

        Arrays.sort(fruits);
        String [] copy = Arrays.copyOf(fruits, 2);
        System.out.println("CopyOf: " + Arrays.toString(copy));
        
        String [] copyrange = Arrays.copyOfRange(fruits,1, 3);
        System.out.println("copyOfRange: " + Arrays.toString(copyrange));
        
        String [] another = {"Hi","Bye","Thanks"};
        System.out.println("Equals: " + Arrays.equals(fruits,another));
                

    for(int i = 0; i < fruits.length; i++){
        System.out.print(fruits[i] + " ");
    }
    
        System.out.println("");
    Integer [] abc = {1,2,3,4,5,6,7,8,9,10}; // Descending Order Only Support Support Non Primitive;
    
        Arrays.sort(abc, Collections.reverseOrder());
        
        System.out.println("DescOrder: " + Arrays.toString(abc));
        
    }
}
