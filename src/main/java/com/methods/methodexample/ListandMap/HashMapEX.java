/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author A-3
 */
public class HashMapEX {
    public static void main(String[] args) {
        Map<Integer,String> hmap = new HashMap<>();
        
        hmap.put(1001,"Robiul");
         hmap.put(1002,"Karim");
          hmap.put(1003,"Zaman");
           hmap.put(1004,"Habib");
           
           hmap.remove(1003);
           hmap.replace(1004,"Larib");
           
           System.out.println("HashMap: " + hmap);
            System.out.println("HashMap: " + hmap.keySet());
            System.out.println("HashMap: " + hmap.values());
            System.out.println("HashMap Contains: " + hmap.containsKey(1001));
            
            //loop throw keyset
            
            for (Integer val : hmap.keySet()) {
                System.out.println("Access value of set : " + val);
        }
            
                for (String val : hmap.values()) {
                System.out.println("Access value String : " + val);
        }
            
            System.out.println("Iterating Hash Map");
            for (Map.Entry m : hmap.entrySet()) {
                System.out.println("HashMAp: " + m.getKey() + " => " + m.getValue());
            
        }
            
        }
    }
    
    

