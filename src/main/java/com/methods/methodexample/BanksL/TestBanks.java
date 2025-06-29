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
        BankAccounts bnk1 = new BankAccounts(1252956555L, "Robiul Hossain", 70000);
        BankAccounts bnk2 = new BankAccounts(1252956445L, "Rakib Mridha", 90000);
        BankAccounts bnk3 = new BankAccounts(1252956225L, "Fahim Hossain", 60000);
        BankAccounts bnk4 = new BankAccounts(1252956775L, "Mahim Hossain", 100000);
        BankAccounts bnk5 = new BankAccounts(1252956005L, "Karim Hossain", 150000);
        BankAccounts bnk6 = new BankAccounts(1252956005L, "Tamima Mostafa Monisha", 100);
        
        
        bnk1.withdraw(69900);
        bnk1.recharge(60);
        bnk1.accountAccess();
        System.out.println("");
        bnk2.accountAccess();
         System.out.println("");
         bnk6.recharge(9);
         bnk6.accountAccess();
    }
}
