/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BanksL;

import java.util.UUID;

/**
 *
 * @author A-3
 */
public class BankAccounts {
   private Long AccountNumber;
   private String AccountName;
   private double balance;

    public BankAccounts(Long AccountNumber, String AccountName, double balance) {
        this.AccountNumber = AccountNumber;
        this.AccountName = AccountName;
        this.balance = balance;
    }
    
    
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amounts: " + amount + " Diposited");
    }
    
    public void withdraw(double amount){
        
        if(amount <= this.balance){
            this.balance -= amount;
            System.out.println("Amounts: " + amount + " Withdraw");
        } else{
            System.out.println("Insufficient balance");
        }
    }
    
    public void recharge(double amount){
         if(amount < 10){
            System.out.println("Invalid Recharge. Minimum amount is 10.");
        }
        else if(amount <= this.balance){
             this.balance -= amount;
            String transactionId = UUID.randomUUID().toString();
            System.out.println("Amount: " + amount + " recharged successfully.");
            System.out.println("Transaction ID: " + transactionId);
        } else{
           System.out.println("Insufficient balance for recharge.");
        }
    }
    
    public void accountAccess(){
        System.out.println("Your Account Name:" + this.AccountName );
        System.out.println("Your Account Number:" + this.AccountNumber );
        System.out.println("Your Current Balance:" + this.balance);
    }
}
