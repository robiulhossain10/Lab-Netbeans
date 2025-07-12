/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ProblemSolve;

import java.util.*;

/**
 *
 * @author A-3
 */
public class GenricsRemoveDuplicateArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,2,5,5,5,7,7,8,9,6,4,6);
        List<Integer> unique = genericMethods(arr);
        System.out.println("Generics remove duplicates: " + unique);
    }

    static <T> List<T> genericMethods(List<T> array) {

        Set<T> sets = new HashSet<>(array);

        for (T i : array) {
            sets.add(i);
        }

        return new ArrayList<>(sets);
    }
}
