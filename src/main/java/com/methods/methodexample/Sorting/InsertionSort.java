package com.methods.methodexample.Sorting;

import java.util.Arrays;

/**
 *
 * @author A-3
 */
public class InsertionSort {
    public static void main(String[] args) {
     int [] arr = {9,6,5,8,7,4,1,2};
     
     insertionSort(arr);
    }
    
    public static void insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            
            while (j >= 0 && arr[j] > key) {                
                arr[j+1] = arr[j];
                j--;
                System.out.println("Arrays 23 line: " + Arrays.toString(arr));
            }
            arr[j+1] = key;
            System.out.println("Arrays 26 line: " + Arrays.toString(arr));
        }
        System.out.println("Arrays: " + Arrays.toString(arr));
    }
}
