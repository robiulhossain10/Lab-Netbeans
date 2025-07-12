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
public class MultiArray {

    public static void main(String[] args) throws Exception {
        int[][] arr = {
            {9, 2, 8, 4},
            {6, 7, 9, 5, 1},
            {1, 1, 9, 2, 4},
            {1, 7, 4, 6}
        };

        MdimensionalArray(arr);
        mDABubble(arr);
    }

    static void MdimensionalArray(int[][] array) {

//        for (int[] is : array) {
//             Arrays.sort(is);
//        }
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println("For i Loop: " + Arrays.deepToString(array));
    }

    static void mDABubble(int[][] arrays2) throws Exception {

        for (int[] arys : arrays2) {
            for (int i = 0; i < arys.length; i++) {
                for (int j = i + 1; j < arys.length; j++) {
                    if (arys[i] > arys[i]) {
                        int temp = arys[j];
                        arys[i] = arys[j];
                        arys[j] = temp;
                    }
                }
            }

        }

        System.out.println("Arrays Bubble Sort: " + Arrays.deepToString(arrays2));

    }
}
