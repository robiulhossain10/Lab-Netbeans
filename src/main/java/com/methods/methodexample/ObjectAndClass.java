/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

/**
 *
 * @author A-3
 */
public class ObjectAndClass {
        int id;
        String name;
        double salary;
        String department;
        
    public static void main(String[] args) {
        
        //Creating Object
        ObjectAndClass emp = new ObjectAndClass(101, "Robiul", 50000);
        
        emp.DisplayOutput();
    }

    ObjectAndClass(int id, String name, double salary) {
       this.id = id;
       this.name = name;
       this.salary = salary;
    }
    
    
     void DisplayOutput(){
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
    
}
