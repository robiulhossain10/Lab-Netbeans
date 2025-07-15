
package com.methods.methodexample.PaymentGatway;

import java.util.UUID;

public abstract class Payment {
    protected String transactionid;
    protected double amount;

        public Payment(double amount) {
        this.transactionid = generateTransactionid();
        this.amount = amount;
    }

    
     public String generateTransactionid(){
        return "TXN" + UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    
    abstract void processPayment();
        
    
}
