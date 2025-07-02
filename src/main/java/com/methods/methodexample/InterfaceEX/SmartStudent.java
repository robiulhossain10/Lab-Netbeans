/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.InterfaceEX;

/**
 *
 * @author A-3
 */
public class SmartStudent extends Pakna{
    // Human interface এর method গুলো
    public void eat() {
        System.out.println("I Eat");
    }

    public void sleep() {
        System.out.println("I Sleep");
    }

    // Student abstract class এর method
    public void study() {
        System.out.println("I Read in Book");
    }

    @Override
    public void fly() {
        System.out.println("Ami Fly Korchi");
    }

    @Override
    public void wings() {
        System.out.println("Wings");
    }
}

