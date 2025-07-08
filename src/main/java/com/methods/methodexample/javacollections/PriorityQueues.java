/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.PriorityQueue;

/**
 *
 * @author A-3
 */
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        pq.add("BMW");
        pq.add("Audi");
        pq.add("BYD");
        pq.add("Tesla");
        
        
        System.out.println("Car: " + pq.poll());
    }
}
