/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.PaymentGatway;

import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class PaymenyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input;
        
       
            System.out.println("Welcome to MyPay$");
            System.out.println("Enter Payment Method");
            System.out.println("Credit Card");
            System.out.println("Debit Card");
            System.out.println("UPI Payments");
            System.out.println("Logout");
            
            
            System.out.println("Enter Payment Method");
            input = sc.nextInt();
            System.out.println("Enter Ammount");
            
            double pay = sc.nextDouble();
            
            Payment payment;
            
            switch (input) {
                case 1 ->
                    payment = new CreditCardPayment(pay);
                case 2 ->
                    payment = new DebitCardPayment(pay);
                case 3 ->
                    payment = new UPIPayment(pay);
                default ->
                {
                    System.out.println("Invalid Payment Method");
                }
                    

                    }
}
}