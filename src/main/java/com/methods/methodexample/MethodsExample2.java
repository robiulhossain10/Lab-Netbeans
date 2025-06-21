/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

/**
 *
 * @author A-3
 */
public class MethodsExample2 {
    public static void main(String[] args) {
        MethodsExample2 std1 = new MethodsExample2();
        MethodsExample2 std2 = new MethodsExample2();
        
        total(26);
    }
    
    public MethodsExample2(){
    
        System.out.println("This is a Constructor");
  }
    
    public static void sysPrint(){
        System.out.println("This is Instance Method");
    }
    
      public static int total(int age){
        System.out.println("This is Return Method " + age);
        return 0;
    }
      
      public static void staticmethod(){
        System.out.println("This is Static Method");
    }
      
        public static void methodparam(String name){
        System.out.println("This is Method With Parameters");
    }
        
            public static void methodparamoverload(String name, int age){
        System.out.println("This is Method With Parameters" + name+ age);
    }
            
                    public static void methodparamoverload(int age, String name){
        System.out.println("This is Method With Parameters" + age+ name);
    }
}
