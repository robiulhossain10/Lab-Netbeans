/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.GenericS;

/**
 *
 * @author A-3
 */
public class GenericsAllinOne {
    public static void main(String[] args) {
        StringProcessor ons = new StringProcessor();
        ons.process("Hello World");
        System.out.println(ons.processData("Hello Brother"));
    }

}

   interface Processor<T>{
       void process(T input);
       T processData(T input);
   }

class StringProcessor implements Processor<String>{

    @Override
    public void process(String input) {
        System.out.println("Processing String: " + input.toUpperCase());
    }

    @Override
    public String processData(String input) {
        
        
        return "Hello";
    }
}
