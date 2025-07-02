/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.InterfaceEX;

/**
 *
 * @author A-3
 */
public class Main {
    public static void main(String[] args) {
        SmartStudent s = new SmartStudent();

        s.eat();         // Human থেকে
        s.sleep();       // Human থেকে
        s.study();       // Student থেকে
        s.attendClass(); // Student এর concrete method
    }
}

