/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ObjectMethods;

/**
 *
 * @author A-3
 */
public class Car {
     String brand;
    String color;
    double speed;

    public Car(String brand, String color, double speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
    
    
    public void getName(){
        System.out.println("I am " + brand);
        System.out.println("I am " + color);
        System.out.println("I am " + speed);
        
    }
    
    
        public static void main(String[] args) {
        Car cls = new Car("BMW","Purple",180);
        Car cls2 = new Car("Audi","Green",350);
        Car cls3 = new Car("BYD","Black",380);
        
        
       cls.brand = "Marcedez";
       cls.getName();
       System.out.println("");
       cls2.getName();
       System.out.println("");
       cls3.getName();
       
    }
}
