/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.InterfaceEX;

/**
 *
 * @author A-3
 */
public class Bird extends Animal implements Flyable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " I am listening Music");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " I am Flying");
    }

    @Override
    void read() {
        System.out.println(getName() + " I Read in Book");
    }
    
}
