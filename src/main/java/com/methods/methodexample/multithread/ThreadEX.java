/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.multithread;

/**
 *
 * @author A-3
 */
public class ThreadEX extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Running: " + ThreadEX.currentThread());
    }
}
