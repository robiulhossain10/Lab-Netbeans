
package com.methods.methodexample.multithread;

public class RunnableEX implements Runnable{
    private final String taskName;

    public RunnableEX(String taskName) {
        this.taskName = taskName;
    }
    
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - count: " + i+ "- Thread " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted!");
            }
        }
     }
    
}
