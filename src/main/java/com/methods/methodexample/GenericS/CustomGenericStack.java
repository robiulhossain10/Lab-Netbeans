/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.GenericS;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *
 * @author A-3
 */
 class CustomGenericStack<T> {
    private List<T> elements = new ArrayList<>();
    
    public void push(T item){
        elements.add(item);
    }
    
    public T pop(){
        if(elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }
    
    public T peek(){
        if(elements.isEmpty()){
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    @Override
    public String toString() {
        return  elements+" ";
    }
}
