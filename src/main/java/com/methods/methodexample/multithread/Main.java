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
//        RunnableEX ts = new RunnableEX("Download Task");
//        
//        Thread t1 = new Thread(ts);
//        Thread t2 = new Thread(new RunnableEX("Upload Task"));
//        
//        t1.start();
//        t2.start();
//        
//        System.out.println("Main Thread Done");
        
        //with Lamda Expression
        
        Thread t = new Thread(() ->{
            System.out.println("Running in " + Thread.currentThread().getName()); 
        });
        
        
        t.start();
    }
}
