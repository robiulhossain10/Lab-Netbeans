/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TryCatch;

/**
 *
 * @author A-3
 */
public class NullPointExpecetions {
    public static void main(String[] args) {
        nullExceptins();
    }
    
static void nullExceptins(){
        try {
            String s = null;
            s.length();
            }catch(NullPointerException e){
            System.out.println("NullPointerExceptions" + e.getMessage());
           }
           }
}
