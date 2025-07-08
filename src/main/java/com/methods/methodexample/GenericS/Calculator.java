/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.GenericS;

/**
 *
 * @author A-3
 */

    //Bounded Generics 
 class Calculator<T extends Number> {
    public double square (T number){
        return number.doubleValue() * number.doubleValue();
    }
}
