/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Value");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Value");
        int c = sc.nextInt();
        
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
