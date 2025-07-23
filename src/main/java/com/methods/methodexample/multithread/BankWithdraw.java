package com.methods.methodexample.multithread;

public class BankWithdraw {

    private double balance;

    public BankWithdraw(double balance) {
        this.balance = balance;
    }
    
    public synchronized void bankWithdraw(double amount,String threadName){
        System.out.println(threadName + " Withdraw Start " + amount);
        if (balance >= amount) {
            try {
                Thread.sleep(1000);
                balance -= amount;
                System.out.println(threadName+ " Balance Withdraw Successful " + balance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Insufficient Balance");
        }
        
    }

     public double getBalance() {
        return balance;
    }
}

class WithdrawTask implements Runnable{
    private BankWithdraw account;
    private int amount;
    private String threadName;

    public WithdrawTask(BankWithdraw account, int amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        account.bankWithdraw(amount, threadName);
    }
    

}


