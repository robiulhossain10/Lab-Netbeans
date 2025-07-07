/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author A-3
 */
public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        matrix.add(new ArrayList<> (Arrays.asList(3,2,1)));
        matrix.add(new ArrayList<> (Arrays.asList(7,8,9)));
        matrix.add(new ArrayList<> (Arrays.asList(4,5,6)));

        System.out.println("Matrix : " + matrix);
        
        
    }
}
