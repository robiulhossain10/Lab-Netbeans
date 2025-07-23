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
    private final String taskName;

    public ThreadEX(String taskName) {
        this.taskName = taskName;
    }
    
    
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(taskName + " - count: " + i+ "- Thread " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(taskName + " was inturrupted");
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
}
