/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.GenericS;

/**
 *
 * @author A-3
 */
public class BoxMain {

    public static void main(String[] args) {
        Integer[] intarr = {1, 2, 3};
        String[] strarr = {"Java", "C++", "PHP", "Kotlin"};

        Box<Integer> one = new Box<>();

        one.setValue(100);
        one.setValue(50);

        System.out.println("Value: " + one.getValue());

        BoxUtilities.printArray(strarr);
    }
}
