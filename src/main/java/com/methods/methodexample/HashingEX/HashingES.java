/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.HashingEX;
import java.util.HashMap;


public class HashingES {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, String> capitalCities = new HashMap<>();

        // Storing key-value pairs (Hashing happens internally)
        capitalCities.put("Bangladesh", "Dhaka");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("Japan", "Tokyo");

        // Accessing values using keys (fast due to hashing)
        System.out.println("Capital of Bangladesh: " + capitalCities.get("Bangladesh"));
        System.out.println("Capital of USA: " + capitalCities.get("USA"));

        // Display all key-value pairs
        System.out.println("\nAll entries:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country + " -> " + capitalCities.get(country));
        }
        
        hashEX();
    }
    
    
    private static void hashEX(){
          String key = "Bangladesh";
        int hashCode = key.hashCode();  // built-in Java hash function
        System.out.println("Hash code of \"" + key + "\": " + hashCode);
    }
}

