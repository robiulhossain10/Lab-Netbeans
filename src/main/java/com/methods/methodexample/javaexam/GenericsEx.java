package com.methods.methodexample.javaexam;

public class GenericsEx<T,K> {
    private T value;
    private K value2;

    public GenericsEx(T value,K value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getValue2() {
        return value2;
    }

    public void setValue2(K value2) {
        this.value2 = value2;
    }

 
    
    public static void main(String[] args) {
        GenericsEx<String,Integer> gs = new GenericsEx<>("Robiul",26);
        
        System.out.println(gs.getValue()+" "+gs.getValue2());
                
    }
    
    
}
