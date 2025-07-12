/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;
import java.util.*;
/**
 *
 * @author A-3
 */
public class RemoveDuplicateArray {
    public static void main(String[] args) {
        Integer [] arr = {1,1,5,6,8,4,4,8,5};
        
        Set<Integer>listset = new HashSet<>();
        
        for (Integer i : arr) {
            listset.add(i);
        }
        
        System.out.println("ListSet: " + listset);
    }
}
