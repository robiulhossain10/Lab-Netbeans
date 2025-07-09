/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author A-3
 */
public class CollectionEX {
    
  
    public static void main(String[] args) {
        
        List<Student10> students = new ArrayList<>();
        
        students.add(new Student10("Robiul",22));
        students.add(new Student10("Fahim",26));
        students.add(new Student10("Akib",28));
        
        Collections.sort(students,(Student10 s1,Student10 s2) -> {
            return Integer.compare(s1.age, s2.age);
        });
        
        System.out.println("Sort With Age: " + students);
        
        Collections.sort(students,(Student10 s1 , Student10 s2) -> {
            return s1.name.compareTo(s2.name);
        });
        
        System.out.println("Sort With Name: " + students);
        
    }
}
