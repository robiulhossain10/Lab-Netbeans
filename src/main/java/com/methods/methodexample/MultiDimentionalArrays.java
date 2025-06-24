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
        MultiArrays();
    }
    
    
    public static void MultiArrays(){
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        System.out.println("Matrix With Classic Loop: ");
        
        for(int [] arr : matrix){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
                for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
