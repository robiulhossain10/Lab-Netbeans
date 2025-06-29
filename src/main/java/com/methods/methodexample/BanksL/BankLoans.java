/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BanksL;

/**
 *
 * @author A-3
 */
public class BankLoans {
    private double totalfund = 500000;
    
    public void bankLoan(double amount){
        this.totalfund -= amount;
        System.out.println("Current" + totalfund);
    }
    
    public void interestbank(Interestcalc s){
            this.totalfund += s.interest ;
            System.out.println("Added Interest Amount" +  s.interest);
            System.out.println("Current" + totalfund);
        }
    
    public static void main(String[] args) {
        Interestcalc int1 = new Interestcalc(6569564644l, 20000);
        
        interestbank(int1);
        
        
        
    }

}


