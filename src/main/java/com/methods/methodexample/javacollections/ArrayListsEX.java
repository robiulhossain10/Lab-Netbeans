package com.methods.methodexample.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author A-3
 */
public class ArrayListsEX {

    public static void main(String[] args) {
        ArrayList<String> flower = new ArrayList<>();

        flower.add("Rose");
        flower.add("Sun Flower");
        flower.add("Beli");
        flower.add("Water Lily");
        flower.add("Hiviscus");
        flower.set(0, "Mint Rose"); // Replace Values

        int val = flower.size();

        boolean x = flower.isEmpty();

        boolean y = flower.contains("Beli");

        System.out.println("Size : " + val);
        System.out.println("ISEmpty : " + x);
        System.out.println("Contains : " + y);

        System.out.println("ArrayList: " + flower);
        System.out.println("");
        //Iterate - For Loop
        for (int i = 0; i < flower.size(); i++) {
            System.out.println("Flower: " + flower.get(i) + " ");
        }
        System.out.println("");
        for (String is : flower) {
            System.out.println("Flower: " + is + " ");
        }
        
        // Iterate - ForEach with Lamda
        
        flower.forEach( item ->
                
            { 
                System.out.println("Flower-lamda: " + item);
        }
        );
        
        arrayTOarraylist();
    }
    
    static void arrayTOarraylist(){
       Integer [] arr = {4,5,8,9,7,5,6,3,2};
       ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(arr));
        
        nums.add(50);
        Collections.sort(nums);
        System.out.println("Sorted Nums: " + nums);
        
        Collections.sort(nums, Collections.reverseOrder());
         System.out.println("Sorted Nums Reverse: " + nums);
    }

}
