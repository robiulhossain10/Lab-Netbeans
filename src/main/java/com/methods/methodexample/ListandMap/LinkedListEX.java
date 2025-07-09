/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;

import java.util.LinkedList;

/**
 *
 * @author A-3
 */
public class LinkedListEX {
    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<>();
        
        linklist.add(100);
        linklist.add(200);
        linklist.add(300);
        linklist.add(400);
        
        linklist.addFirst(99);
        linklist.addLast(401);
        
        linklist.offerFirst(98);
        linklist.offerLast(402);
        
        System.out.println("Linked List: " + linklist);
    }
}
