/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ObjectMethods;

/**
 *
 * @author A-3
 */
public class BankAccount {
   private Long account_number;
   private String account_holder;
   private double balance;

    public BankAccount(Long account_number, String account_holder, double balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }
    
    public void Deposit(double ammount){
        this.balance += ammount;
        System.out.println("Ammount $" + ammount + " Diposited ");
    }
    
    public void withdraw(double ammount){
        if(ammount <= this.balance){
            this.balance -= ammount;
            System.out.println("Ammount $" + ammount + " Withdraw ");
        } else{
            System.out.println("Insufficient balance");
        }
    }
    
    public void displayBalance(){
        System.out.println("your Account Name " + this.account_holder);
        System.out.println("your Account Number is " + this.account_number);
        System.out.println("Current Balance is $" + this.balance);
        
    }
    
    
    
   
    
    
    
}
