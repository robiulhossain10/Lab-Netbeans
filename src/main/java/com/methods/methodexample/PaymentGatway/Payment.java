
package com.methods.methodexample.PaymentGatway;

import java.util.UUID;

/**
 *
 * @author ROBIUL
 */
public abstract class Payment {
    String transactionId;
    double amount;

    public Payment(double amount) {
        this.transactionId = generateTransactionId();
        this.amount = amount;
    }
    
    public String generateTransactionId(){
        return "TRX" + UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }
    
    public abstract void processingPayment();
    
}
