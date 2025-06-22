/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.methods.methodexample;

/**
 *
 * @author A-3
 */
public class MethodExample {
    
    
      String name;
    int age;
    static String address = "Khulna";

    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
        obj.printName();
        obj.printName("Ahmad");
        obj.printName();
        obj.printAdd();
        obj.printAdd("Feni");
        obj.printAdd();
        
        
        MethodExample obj2 = new MethodExample();
        obj2.printName();
        obj2.printName("Rahim");
        obj2.printName();
        obj2.printAdd();
        
        MethodExample obj3 = new MethodExample();
        obj3.printName();
        obj3.printName("Jahid");
        obj3.printName();
    }

  

    void printName() {

        System.out.println("Hello " + name + "!!");
    }

    void printName(String nameParam) {
        name = nameParam;
        System.out.println("Hello " + name + "!!");
    }
    
        void printAdd() {
        System.out.println("Hello " + address + "!!");
    }
           void printAdd(String param) {
               address = param;
        System.out.println("Hello " + address + "!!");
    }


    void printAge(int ageParam) {
        age = ageParam;
        System.out.println("Your Age " + age + "!!");
    }
}
