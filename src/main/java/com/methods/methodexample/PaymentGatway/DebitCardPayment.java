///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.methods.methodexample.PaymentGatway;
//
///**
// *
// * @author A-3
// */
//public class DebitCardPayment extends Payment implements PaymentMethod{
//    
//    public  DebitCardPayment(double amount){
//        super(amount);
//    }
//
//    @Override
//    void processPayment() {
//        authenticateUser();
//        completeTransaction(amount);
//       System.out.println("Transaction Completed with ID: " + transactionid);
//    }
//
//    @Override
//    public void authenticateUser() {
//       System.out.println("Authenticating Debit Card");
//    }
//
//    @Override
//    public void completeTransaction(double amount) {
//      System.out.println("Charging Debit Card " + amount);
//    }
//    
//}
