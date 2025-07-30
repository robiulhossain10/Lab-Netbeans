/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A-3
 */
public class LoopExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Robiul");
        list.add("Fahim");
        list.add("Monisha");
        list.add("Rakib");
        list.add("Robiul");

        loopExample(list);

        Thread t = new Thread(() -> {

            for (int i = 0; i < 10; i++) {

                System.out.println("GOooooooooaaaaaaaallllllllllllllll");

            }

        });
        
        
              t.start();

           
            
            try {
                t.join();
            } catch (InterruptedException ex) {
               
            }
        
        
        
        
        
        
    }

    public static void loopExample(List<String> list) {
//        for (String string : list) {
//            System.out.println(string);
//        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        int i = 0;

//        while (i < list.size()) {            
//            System.out.println(list.get(i));
//            i++;
//        }
        do {
            System.out.println(list.get(i));
            i++;
        } while (i < list.size());
    }
}
