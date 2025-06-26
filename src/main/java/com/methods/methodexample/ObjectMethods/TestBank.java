/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ObjectMethods;

/**
 *
 * @author A-3
 */
public class TestBank {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(131254455l, "Robiul Hossain", 50000);
        BankAccount ac2 = new BankAccount(131254455l, "Fahim Faiyaz", 0);
        BankAccount ac3 = new BankAccount(131254455l, "Rakib Mridha", 70000);
        
        ac1.withdraw(20000);
        ac1.displayBalance();
        ac1.Deposit(2000);
        ac1.withdraw(70000);
        ac1.displayBalance();
        System.out.println("");
        ac2.Deposit(30000);
        ac2.displayBalance();
        System.out.println("");
        ac3.displayBalance();
    }
}
