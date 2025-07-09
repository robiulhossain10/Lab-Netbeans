/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author A-3
 */
public class HashSetEX {
    public static void main(String[] args) {
        //cant contain duplicate value unique value store only
        Set<Integer> hset = new HashSet<>();
        
        hset.add(50);
        hset.add(40);
        hset.add(20);
        hset.add(10);
        hset.add(null); // null accepted
        
        //Add new value using AddAll Methods
        Set<Integer> moreset = new HashSet<>();
        
        moreset.add(60);
        moreset.add(70);
        
        hset.addAll(moreset);
        
        System.out.println("HashSet: " + hset.addAll(moreset));
        System.out.println("HashSet: " + hset);
        
    }
}
