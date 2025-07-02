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
        Human s = new SmartStudent();

//        s.eat();         // From Human 
//        s.sleep();       // From Human 
//        s.study();       // From Student 
//        s.attendClass(); // From Student concrete method

//            s.fly();

    s.fly();
    s.eat();
    s.sleep();
    s.study();
        
    }
}

