/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BanksL;

/**
 *
 * @author A-3
 */
public class TestBanks {
    public static void main(String[] args) {
         BankAccounts bank1 = new BankAccounts(1232555455l, "Robiul Hossain", 70000);
        BankAccounts bank2 = new BankAccounts(1232555455l, "Kazi Joynal", 50000);
        BankAccounts bank3 = new BankAccounts(1232555455l, "Habib Khan", 500);
        BankAccounts bank4 = new BankAccounts(1232555455l, "Sabrina Aurpa", 100000);

        

       
        
        bank4.accountAccess();
        System.out.println("");
         bank4.bankLoan(10000,1);

         
    }
}
