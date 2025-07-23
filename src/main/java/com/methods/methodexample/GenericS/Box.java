package com.methods.methodexample.GenericS;

//----------------  Generics Class  ---------------------

public class Box<T> {
    private T value;



    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}
