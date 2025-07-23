package com.methods.methodexample.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollExample {

    public static void main(String[] args) {
        //create a pool with 3 threads

        ExecutorService executor = Executors.newFixedThreadPool(3);

        //submit 5 task
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            executor.submit(() -> {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Thread no: " + taskId
                            + " - Count: " + j
                            + " - Thread " + Thread.currentThread().getName());
                    try {
                        if (taskId == 2 || taskId == 3) {
                            Thread.sleep(3000);
                        } else {
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        System.err.println("Download task interrupted");
                    }
                }
            });
        }
    }
}
