/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import java.util.Arrays;

/**
 *
 * @author A-3
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [][] arr = {
            {4,3,2,1},
            {6,5,4,1},
            {9,8,7,5}
        };
        bubbleSort(arr);
    }
    
    static void bubbleSort(int [] [] array){
        for (int[] arys : array) {
            for (int i = 0; i < arys.length; i++) {
                for (int j = i+1; j < arys.length; j++) {
                    if(arys[i] > arys[j]){
                        int temp = arys[i];
                        arys[i] = arys[j];
                        arys[j] = temp;
                    }
                }
            }
        }
        System.out.println("Arrays: " + Arrays.deepToString(array));
    }
}
