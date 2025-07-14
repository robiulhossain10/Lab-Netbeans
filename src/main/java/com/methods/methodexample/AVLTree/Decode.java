/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.AVLTree;

/**
 *
 * @author A-3
 */
import java.util.Base64;

public class Decode {
    public static void main(String[] args) {
        String encodedString = "SGVsbG8sIEJhc2U2NCBpbiBKYXZhIQ=="; // Example encoded string
        
        // Get a decoder instance
        Base64.Decoder decoder = Base64.getDecoder();
        
        // Decode the Base64 string to a byte array
        byte[] decodedBytes = decoder.decode(encodedString);
        
        // Convert the byte array back to a string
        String decodedString = new String(decodedBytes);
        
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}
