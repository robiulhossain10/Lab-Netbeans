/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author A-3
 */
public class MinMaxArray {
    
    // Main Method
    
    public static void main(String[] args) {
        MinMax();
        SumAVG();
        SortArray();
        
        
        RemoveDuplicates(new int [] {5,5,8,6,4,8});
        ReverseArray(new int [] {5,4,3,2,1});
    }
    
    
    
    public static void MinMax(){
        int [] maxs = {9,5,6,7,5,7,3};
        
        int max = maxs[0];
        int min = maxs[0];
        for(int i = 0; i < maxs.length; i++){
            if(max < maxs[i]){
                max = maxs[i];
            }
            if(min > maxs[i]){
                min = maxs[i];
            }
        }
        System.out.println(" Max " + max + " Min " + min);
    }
    
    // Calculate the sum and average of all elements in array
    
    public static void SumAVG(){
        int [] array1 = {9,5,6,7,5,7,3,85};
        
        int total = 0;
        
        for(int i = 0; i < array1.length; i++){
            
            total +=  array1[i];
            
           
        }
        double averages = (double) total / array1.length;
         System.out.println(" Sum " + total + " Average: " + averages);
    }
    
    
    
    //Sorting Array Ascending Order
    
    public static void SortArray(){
        int [] sorting = {6,9,8,7,3,2,5,4,1};
        
        Arrays.sort(sorting);
        for(int i = 0; i < sorting.length; i++){
            
           
        }
        System.out.println(Arrays.toString(sorting));
    }
    
    // Remove Duplicates From Arrays
    
    static int [] RemoveDuplicates(int[] arr ){
        
       int [] unique = Arrays.stream(arr) .distinct() .toArray();
        System.out.println("RemoveDuplicate Array: " + Arrays.toString(unique));
        return unique;
    }
    
    static int [] ReverseArray(int[] arr ){
        
       int [] reversed = new int [arr.length];
       int j = 0;
       for(int i = arr.length -1; i >= 0; i--){
           reversed [j] = arr[i];
           j++;
       }
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
        return reversed;
    }
}
