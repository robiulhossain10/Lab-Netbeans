/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author A-3
 */
public class SublistsAndEquals {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Orange","Kiwi","Mango"));
        List<String> sub = fruits.subList(1, 4);
        System.out.println("Sublist (1-3): " + sub);
        
        
        //Equals
        
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","B","C"));
        System.out.println("Are list1 and list 2 equals? : " + list1.equals(list2));
    }
}
