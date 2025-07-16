/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.HashingEX;

import java.util.HashMap;

/**
 *
 * @author A-3
 */
public class CustomHashing {
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        map.put(new Employee(101,"Robiul"), "Developer");
         map.put(new Employee(102,"Fahim"), "Developer");
          map.put(new Employee(103,"Karim"), "Tester");
          
          System.out.println(map);
          System.out.println("");
          System.out.println(map.get(new Employee(101, "Robiul")));
    }
    
}
