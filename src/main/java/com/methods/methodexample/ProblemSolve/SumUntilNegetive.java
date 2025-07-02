/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import com.sun.source.tree.ContinueTree;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class SumUntilNegetive {
    public static void main(String[] args) {
        
        int [] [] arr = {
            {1,99,91,11,44},
            {0,10,9,9,11},
            {3,23,21,5,11},
            {13,4,45,66,33},
            {11,0,1,20,56}
        };
        
        
        bubbleSort(arr);
//        problem1();
            minMax();
        
        
//        SumNegetive();
        
    }
    
//    static void SumNegetive(){
//        Scanner sc = new Scanner(System.in);
//        
//        
//        int input = 0;
//        int sum = 0;
//        
//        while (input >= 0) {
//            System.out.println("Enter a Value");
//            input = sc.nextInt();
//            
//            if(input >= 0){
//                sum += input;
//            }
//            
//        }
//        
//        System.out.println("Sum: " + sum);
//    }
    
    
    static void bubbleSort(int [] [] array3){
        for (int[] arys1 : array3) {
            for (int i = 0; i < arys1.length; i++) {
                for (int j = i+1; j < arys1.length; j++) {
                    if(arys1[i] > arys1[j]){
                        int temp = arys1[i];
                        arys1[i] = arys1[j];
                        arys1[j] = temp;
                    }
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.deepToString(array3));
    }
//    static void problem1(){
//    int a = 5;
//
//    while (true) {            
//        if(a <= 4){
//            break;
//        }
//        a += 3;  // increase instead of decrease
//        System.out.println("Hello");
//    }
//}
    
    
    static void minMax(){
        
        int min = Integer.MAX_VALUE;
       
        int max = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Lowest Number");
         System.out.println("Enter a Highest Number");
        for (int i = 0; i < 3; i++) {
            int temp = input.nextInt();
            if (max < temp) {
                max = temp;
            }
            if(min > temp){
                min = temp;
            }
        }
        System.out.println("Highest Number: " + max);
        System.out.println("Lowest Number: " + min);
    }

}
