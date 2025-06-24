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
public class SortArray {
    public static void main(String[] args) {
        Sorting();
        int [] arr2 = {1,2,3,2,4,1,5,3,-5,-70,-1};
        int [] arrys = BubbleSorting(arr2.clone());
    }
    
    public static void Sorting(){
        int [] arr = {1,2,3,2,4,1,5,3,-5,-70,-1};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            
        }
        System.out.println("Array Sort: " + Arrays.toString(arr));
    }
    
    public static int [] BubbleSorting(int [] arr){
        
      for(int i = 0; i < arr.length - 1; i++){
          for(int j = 0; j < arr.length -1 -i; j++){
              if(arr[j] < arr[j+1]){
                  //swap arr [j] and arr [j+1]
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
        
        System.out.println("Bubble Array Sort: " + Arrays.toString(arr));
        return arr;
    }
}
