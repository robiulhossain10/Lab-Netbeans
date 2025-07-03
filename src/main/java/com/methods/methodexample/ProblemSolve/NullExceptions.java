/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

/**
 *
 * @author A-3
 */
public class NullExceptions {
    public static void main(String[] args) {
        try {
            String name = null;
            name.length();
           
        } catch (NullPointerException e) {
            System.out.println("This is Null" + e.getMessage());
        }finally{
            System.out.println("This Code Run successfully");
        }
    }
}
