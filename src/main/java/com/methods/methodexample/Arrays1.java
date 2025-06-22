/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author A-3
 */
public class Arrays1 {
    
    public static void main(String[] args) {
//        int[] numbers = new int [5];
//        
//        int[] numbers2;
//        numbers2 = new int[] {2,9,1,7};
//        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 7 Number");
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println("Number" + (i+1) + ": ");
//            numbers[i] = input.nextInt();
//        }
//        
//           // Sort the array
//        Arrays.sort(numbers);
//        
//        System.out.println("Array Length: " + numbers.length);
//        System.out.println("Array 0 Index: " + numbers[0]);
//        System.out.println("Arrays: " + Arrays.toString(numbers));
        
//        arraysEX();
//ArrManu();
arrayAVG();
    }
    
    
    public static void arraysEX(){
       
       
        int [] numbers3 = new int[] {2,5,8,7,5,6};
        
        Arrays.sort(numbers3);
        
        System.out.println("Arrays: " + Arrays.toString(numbers3)); 
       
        for(int i = 0; i < numbers3.length; i++){
        
            System.out.print(numbers3[i]);
    }

}
    
    
    
    public static void ArrManu(){
         int[] manarray = new int[7] ;
         
        manarray[0] = 5;
        manarray[1] = 9;
        manarray[2] = 7;
        manarray[3] = 2;
        manarray[4] = 1;
        manarray[5] = 3;
        manarray[6] = 6;
        
        for(int i = 0; i < manarray.length; i++){
            System.out.print(" Arrays: " + i + ": " + manarray[i]*100);
            
           
        }
        System.out.println("");
        
        System.out.print("Arrays: ");
        
        for(int i = 0; i < manarray.length; i++){
            if(i == 5){
                System.out.print(manarray[i] * 100 + " ");
            } else {
                System.out.print(manarray[i] + " ");
            }
            
        }
        
        System.out.println("");
        
        System.out.print("Arrays: ");
        
        
    }
    
    
public static void arrayAVG() {
   int [] avgarray = new int [] {5,8,9,3,5,6,7};
   
   int total = 0;
   //FOR Each Loop
//   for(int num : avgarray){ 
//       total += num;
//   }
//   
//   double avarage = total / avgarray.length;
//    System.out.println("Average of the array: " + avarage);

//FOR i Loop
for(int i = 0; i < avgarray.length; i++){
    total += avgarray[i];
}
    double average = (double) total / avgarray.length;
    System.out.println("Avarage: " + average);
}
}
