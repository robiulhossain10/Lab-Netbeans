/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ConsoleBank;

import java.io.Serializable;

/**
 *
 * @author A-3
 */
public class Accounts implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Double balance;

    public Accounts(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Account{");
//        sb.append("id=").append(id);
//        sb.append(", name=").append(name);
//        sb.append(", balance=").append(balance);
//        sb.append('}');
//        return sb.toString();
//    }

    
     public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit successful. New Balance: " + balance);
            return true;
        } else {
            System.out.println("❌ Invalid deposit amount.");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful. New Balance: " + balance);
            return true;
        } else {
            System.out.println("❌ Withdrawal failed. Insufficient balance or invalid amount.");
            return false;
        }
    }

    public void display() {
        System.out.println("📄 Account ID: " + id + ", Name: " + name + ", Balance: " + balance);
    }
}

