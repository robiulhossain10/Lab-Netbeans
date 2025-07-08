/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.GenericS;

/**
 *
 * @author A-3
 */
public class TestMain {

    public static void main(String[] args) {
        Integer[] intarr = {1, 2, 3};
        String[] strarr = {"Java", "C++", "PHP", "Kotlin"};

        Box<Integer> one = new Box<>();
        Box<String> two = new Box<>();
        Box<Boolean> three = new Box<>();
        Box<Long> four = new Box<>();
        Box<Double> five = new Box<>();

        one.setValue(100);
        two.setValue("Java");
        three.setValue(true);
        four.setValue(46466854445l);
        five.setValue(100.51);

        System.out.println("Integer Value: " + one.getValue());
        System.out.println("String Value: " + two.getValue());
        System.out.println("Boolean Value: " + three.getValue());
        System.out.println("Long Value: " + four.getValue());
        System.out.println("Double Value: " + five.getValue());
        
        System.out.println("");

        BoxUtilities.printArray(strarr);
        
        //Calculator Square Value
        
        Calculator<Double> dobleCalculator = new Calculator<>();
        
        System.out.println("Square: " + dobleCalculator.square(5.5));
        
        //Custom Generics Stack
        
        CustomGenericStack<String> mystack = new CustomGenericStack<>();
        
        mystack.push("A");
        mystack.push("B");
        mystack.push("C");
        
        
        System.out.println("mystack" + mystack);
        
        System.out.println("mystack " + mystack.peek());
        
        
    }
}
