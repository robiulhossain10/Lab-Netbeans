/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author A-3
 */

// FIFO method 
public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("X");
        queue.offer("Y");
        queue.offer("Z");
        
        System.out.println("Queue: " + queue);
        System.out.println("Queue Peek: " + queue.peek());
        System.out.println("Queue Poll: " + queue.poll());
        System.out.println("Queue: " + queue);
    }
}
