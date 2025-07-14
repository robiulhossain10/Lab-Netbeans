/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.AVLTree;
    import java.util.Base64;
/**
 *
 * @author A-3
 */
public class Base64s {


    public static void main(String[] args) {
        String originalString = "Hello, Base64 in Java!";
        
        // Get an encoder instance
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        
        // Encode the string to a byte array and then to a Base64 string
        String encodedString = encoder.encodeToString(originalString.getBytes());
        
        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String: " + encodedString);
        
        
    }
}
