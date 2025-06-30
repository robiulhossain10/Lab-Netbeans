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
   private double loanAmount; 
   private final double interestRate = 0.13;

    public BankAccounts(Long AccountNumber, String AccountName, double balance) {
        this.AccountNumber = AccountNumber;
        this.AccountName = AccountName;
        this.balance = balance;
        this.loanAmount = 0;
    }

    //
    public void bankLoan(double amount, int years) {
        if (amount > 0) {
            loanAmount += amount;
            balance += amount;
            System.out.println("Loan approved: " + amount);
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Invalid loan amount.");
        }
         
        loanStatus(years);
        accountAccess();
       
    }
    
//    public double calculateInterest(int years){
//        return loanAmount * interestRate * years;
//        
//    }

    
public void loanRepayment(double amount, int years) {
    if (amount <= 0) {
        System.out.println("Invalid repayment amount.");
        return;
    }

    if (loanAmount <= 0) {
        System.out.println("No loan to repay.");
        return;
    }

    if (amount > loanAmount) {
        System.out.println("You are trying to repay more than your loan.");
        return;
    }

    double interest = amount * interestRate * years;
    double totalRepayment = amount + interest;

    if (totalRepayment > balance) {
        System.out.println("Insufficient balance to repay with interest.");
        return;
    }

    balance -= totalRepayment;
    loanAmount -= amount;

    System.out.println("Loan repaid: " + amount);
    System.out.println("Interest paid: " + interest);
    System.out.println("Total deducted from balance: " + totalRepayment);

    
    
}





    public void loanStatus(int years) {
    if (loanAmount <= 0) {
        System.out.println("You have no active loan.");
    } else {
        System.out.println("Loan Status (" + years + " year):");
        System.out.println("Current Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
       
        double estimatedInterest = loanAmount * interestRate * years;
        double totalDue = loanAmount + estimatedInterest;

        System.out.println("Estimated Interest (" + years + " year): " + estimatedInterest);
        System.out.println("Total Payable Amount: " + totalDue);
    }
}



    
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amounts: " + amount + " Deposited");
    }

    public void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
            System.out.println("Amounts: " + amount + " Withdrawn");
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
        System.out.println("Your Account Name: " + this.AccountName );
        System.out.println("Your Account Number: " + this.AccountNumber );
        System.out.println("Your Current Balance: " + this.balance);
    }
}
