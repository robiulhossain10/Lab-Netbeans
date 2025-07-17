
package com.methods.methodexample.multithread;

/**
 *
 * @author A-3
 */
public class RunnableEX implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Running: " + ThreadEX.currentThread());
    }
    
}
