/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinaryIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author A-3
 */
public class ObjectStream {
    public static void main(String[] args) {
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream("employee.txt"));
            
        } catch (Exception e) {
            
        }
    }
}
