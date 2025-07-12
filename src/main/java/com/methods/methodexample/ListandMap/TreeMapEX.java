/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;

import java.util.*;

/**
 *
 * @author A-3
 */
public class TreeMapEX {
    public static void main(String[] args) {
        Map<String,Integer> tree = new TreeMap<>();
        //sort key only
        tree.put("Galib",1);
        tree.put("Fahim",5);
        tree.put("Akib",3);
        tree.put("Zerin",4);
        tree.put("Bablu",2);
        
        System.out.println("TreeMap: " + tree);
    }
}
