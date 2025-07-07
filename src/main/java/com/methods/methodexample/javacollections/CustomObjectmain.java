/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.ArrayList;

/**
 *
 * @author A-3
 */
public class CustomObjectmain {
    public static void main(String[] args) {
        ArrayList <CustomArrStudent> students = new ArrayList<>();
        
        students.add(new CustomArrStudent("Saiful",32));
        students.add(new CustomArrStudent("Arafat",26));
        students.add(new CustomArrStudent("Anika",16));
        
        for (CustomArrStudent st : students) {
            st.displayData();
            System.out.println("-------------------");
        }

        
    }
}
