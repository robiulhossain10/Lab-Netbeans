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
public class StringTest {
    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silent";
        
        String[] ar = input1.split("");
        String[] ar2 = input2.split("");
        
        Arrays.sort(ar);
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.equals(ar,ar2));
        freqCount();
        
    }
    
    static void freqCount(){
        String str = "banana";
        Map<Character,Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
//           map.put(c, map.getOrDefault(c, 0) + 1);
           
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val + 1);
                
            }else{
                map.put(c, 1);
            }
            
        }
        map.forEach((k, v) -> {System.out.println(k + " : " + v);});
//        System.out.println("FreqCount: " + map);
    }
}
