/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Recursions;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author A-3
 */
public class Fibonacci {
    public static void main(String[] args) {
           
        int n = 5;

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

   // Create a map to store computed Fibonacci values
    private static Map<Integer, Integer> memo = new HashMap<>();
    // Optimized recursive function using memoization
    static int val = 0;
    public static int fibonacci(int n) {
        val++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Check if result is already cached
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // Calculate and store in map
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
        
    }
}