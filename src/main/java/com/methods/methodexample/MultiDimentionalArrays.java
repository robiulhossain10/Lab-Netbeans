/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

import java.util.Arrays;

/**
 *
 * @author A-3
 */
public class MultiDimentionalArrays {

    public static void main(String[] args) {

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 45, 81}
        };
        MultiArrays(matrix2);
        sumOfMatrix(matrix2);
        sumOf3Totals(matrix2);
    }

    public static int MultiArrays(int [] [] matrix) {
//        int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };

        System.out.println("Matrix With Classic Loop: ");

        for (int[] arr : matrix) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("ForEach Loop Start: ");
        // using for each loop

        for (int[] arrys1 : matrix) {
            for (int value : arrys1) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void sumOfMatrix(int[][] matrix2) {

        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int num = 0;
        for (int[] arr : matrix2) {
            for (int val : arr) {
                sum += val;
                num++;
            }
        }

        double average = (double) sum / num;
        System.out.println("Sum = " + sum + " Avarage: " + average);

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                sum += matrix2[i][j];
                num++;
            }

        }
        double average2 = (double) sum / num;
        System.out.println("Sum for i loop = " + sum + " Avarage for i loop: " + average2);

        
    }
    
    static int sumOf3Totals(int [][] matrix3){
        // Just one loop needed to calculate sum
        int sum = 0;
        int sum2 = 0;
        int sum3= 0;
    for (int i = 0; i < matrix3.length; i++) {
        for (int val : matrix3[i]) {
            if(i == 0){
                sum += val;
            }
            else if(i == 1){
                sum2 += val;
            }
            else if(i == 2){
                sum3 += val;
            }
        }
        
    }

    System.out.println("Array: " + sum);
    System.out.println(" Array2: "+sum2);
    System.out.println(" Array3: "+sum3);
    return sum;
        
    }
}
