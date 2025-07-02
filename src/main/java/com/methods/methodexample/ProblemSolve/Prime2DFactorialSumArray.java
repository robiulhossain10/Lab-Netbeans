/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class Prime2DFactorialSumArray {
    public static void main(String[] args) {
//        findPrime();
//        twoDimentionArr();
//        factorialNumber();
        arraySum();
    }
    
static void findPrime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int num = input.nextInt();
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

        static void twoDimentionArr(){
            int [] [] arr = {
                {1,2},
                {3,4},
                {5,6}
            };
            
            int sum = 0;
            
            for (int[] arry : arr) {
                for (int i : arry) {
                     sum += i;
                }
            }
            System.out.println("Sum: " + sum);
        }
        
        static void factorialNumber(){
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter a Factorial Value");
            int num = inp.nextInt();
            
            
            int factorial = 1;
            
            for (int i = 2; i <= num; i++) {
                factorial *= i ;
            }
            
            System.out.println("Factorial: " + factorial);
        }
        
        static void arraySum(){
            int [] arr1 = {1,3,5,8,4};
            int sum = 0;
            int mun = 0;
            
            for (int m : arr1) {
                sum += m;
            }
            for (int i = 0; i < arr1.length; i++) {
                mun += arr1[i];
            }
            System.out.println("SumArray: " + sum);
            System.out.println("SumArrayFori: " + mun);
        }
}
