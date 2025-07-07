/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.Stack;

/**
 *
 * @author A-3
 */

//Lifo Method
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        System.out.println("Stack: " + stack);
        System.out.println("Stack Peek: " + stack.peek()); //C
        System.out.println("stack pop: " + stack.pop()); // C remove
        System.out.println("Stack Peek: " + stack.peek()); // B
    }
}
