package com.methods.methodexample.multithread;

public class Customer {

    public static void main(String[] args) {
        BankWithdraw bank = new BankWithdraw(10000.00);

        Thread t1 = new Thread(new WithdrawTask(bank, 500, "Thread-1"));
        Thread t2 = new Thread(new WithdrawTask(bank, 6000, "Thread-2"));
        Thread t3 = new Thread(new WithdrawTask(bank, 1000, "Thread-3"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

            System.out.println("Final Balance " + bank.getBalance());
            System.out.println("Main thread finished: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
