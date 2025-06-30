/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TryCatch;

import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class NumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Input");
        String userInput = input.nextLine();
        
        
         try {
            int number = Integer.parseInt(userInput); 
            System.out.println("You are Typing: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        } finally{
             System.out.println("Finaaaaaallyyyyyyyyyyy");
         }
    }
    
  
   
}