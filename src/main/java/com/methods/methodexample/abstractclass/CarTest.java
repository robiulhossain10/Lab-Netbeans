package com.methods.methodexample.abstractclass;

/**
 *
 * @author A-3
 */
public class CarTest {
    public static void main(String[] args) {
        Car myCar;
        
        myCar = new SportsCar();
        myCar.start();
        myCar.drive();
        myCar.stop();
        
        System.out.println();
        
        myCar = new ElectriCar();
        myCar.start();
        myCar.drive();
        myCar.stop();
        
        
    }
}
