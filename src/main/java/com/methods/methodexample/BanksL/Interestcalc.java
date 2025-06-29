/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BanksL;

/**
 *
 * @author A-3
 */
public class Interestcalc {
     
    Long AccountNumber;
    double loanAmount;
   double interest;

    public Interestcalc(Long AccountNumber, double loanAmount) {
        this.AccountNumber = AccountNumber;
        this.loanAmount = loanAmount;
         this.interest = loanAmount * 0.10 ;
    
    
  
    
}
}