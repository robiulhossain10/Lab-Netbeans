/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.abstractclass;

/**
 *
 * @author A-3
 */
public abstract class Car {
    abstract void start();
    abstract void drive();
    
    void stop(){
        System.out.println("Car is Stopping");
    
    };
}
