/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.abstractclass;

/**
 *
 * @author A-3
 */
public class ElectriCar extends Car{

    @Override
    void start() {
        System.out.println("The Electric Car is Start");
    }

    @Override
    void drive() {
        System.out.println("The Electric Car Drive Slow");
    }
    
}
