/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javacollections;

import java.util.*;

public class LinkedListEX {

    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        Vector<String> vlist = new Vector<>();
        
        vlist.add("Arafat");

        llist.add("Robiul");
        llist.add("Fahim");
        llist.add("Rakib");
        llist.add("Ariful");
        llist.offerFirst("Zaman");

        System.out.println("Linked List : " + vlist);
    }
}
