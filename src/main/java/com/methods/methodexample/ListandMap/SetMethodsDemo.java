/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;



import java.util.*;

public class SetMethodsDemo {
    public static void main(String[] args) {

        // ✅ Create a Set
        Set<String> names = new HashSet<>();

        // ✅ add(E e)
        names.add("Saiful");
        names.add("Hasan");
        names.add("Raihan");
        names.add("Saiful"); // Duplicate will be ignored


        System.out.println("➡️ Initial Set: " + names);

        // ✅ contains(Object o)
        System.out.println("✅ Contains 'Hasan'? " + names.contains("Hasan"));

        // ✅ isEmpty()
        System.out.println("✅ Is empty? " + names.isEmpty());

        // ✅ size()
        System.out.println("✅ Size of set: " + names.size());

        // ✅ remove(Object o)
        names.remove("Raihan");
        System.out.println("✅ After removing 'Raihan': " + names);

        // ✅ iterator()
        System.out.println("✅ Iterating using Iterator:");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(" - " + itr.next());
        }

        // ✅ addAll(Collection)
        Set<String> moreNames = new HashSet<>();
        moreNames.add("Nayeem");
        moreNames.add("Rakib");

        names.addAll(moreNames);
        System.out.println("✅ After addAll(): " + names);
        moreNames.add("Rakib2");

        // ✅ containsAll(Collection)
        boolean allPresent = names.containsAll(moreNames);
        System.out.println("✅ Contains all from moreNames? " + allPresent);

        // ✅ removeAll(Collection)
        names.removeAll(moreNames);
        System.out.println("✅ After removeAll(): " + names);

        // ✅ retainAll(Collection)
        System.out.println("✅ Before retainAll() (intersection): " + names);
        Set<String> checkSet = new HashSet<>(Arrays.asList("Saiful", "Hello", "World"));
        names.retainAll(checkSet);
        System.out.println("✅ After retainAll() (intersection): " + names);

        // ✅ toArray()
        Object[] arr = names.toArray();
        System.out.println("✅ Set as array: " + Arrays.toString(arr));

        // ✅ clear()
        names.clear();
        System.out.println("✅ After clear(): " + names);
        System.out.println("✅ Is empty after clear? " + names.isEmpty());
    }
}
