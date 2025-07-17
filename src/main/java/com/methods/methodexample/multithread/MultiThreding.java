package com.methods.methodexample.multithread;


class MultiThreding {
    private int balance = 2000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Balance Withdraw: " + amount);
            balance -= amount;
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    
        public static void main(String[] args) {
        MultiThreding account = new MultiThreding();
        Thread t1 = new Thread(() -> {
            account.withdraw(700);
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            account.withdraw(600);
        });

        
        t2.start();
    }
}