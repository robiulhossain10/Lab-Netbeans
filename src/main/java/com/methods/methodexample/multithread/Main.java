/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.multithread;

/**
 *
 * @author A-3
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Lamda Main Threads: " + Thread.currentThread().getName());
        });
        t1.start(); 
        
        ThreadEX t2 = new ThreadEX();
        t2.start();
    }
}
