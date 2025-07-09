/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;

import java.util.*;

public class MapExampleDemo {

    public static void main(String[] args) {

        /*
        Each key maps to one value
        Keys must be unique
        Values can be duplicated
         */
        // ✅ 1. HashMap (no order, allows one null key)
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Saiful", 90);
        hashMap.put("Hasan", 85);
        hashMap.put("Nayeem", 88);
        hashMap.put(null, 100); // Only one null key allowed
        System.out.println("🔹 HashMap: " + hashMap);

        /*
        A subclass of HashMap.

Maintains the insertion order of elements.

Allows one null key and multiple null values.

Performance is almost same as HashMap but uses more memory (because it keeps a linked list of entries).
        
         */
        // ✅ 2. LinkedHashMap (maintains insertion order)
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Saiful", 90);
        linkedMap.put("Hasan", 85);
        linkedMap.put("Nayeem", 88);
        System.out.println("🔹 LinkedHashMap: " + linkedMap);

        /*
        Implements NavigableMap and SortedMap.

        Stores entries in sorted order of keys (natural order or using custom Comparator).

        ❌ Does not allow null keys (throws NullPointerException)

        ✅ Allows multiple null values.
         */
        // ✅ 3. TreeMap (sorted by keys)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Saiful", 90);
        treeMap.put("Hasan", 85);
        treeMap.put("Nayeem", 88);
        System.out.println("🔹 TreeMap: " + treeMap);

        Map<String, Integer> reverseTree = new TreeMap<>(Collections.reverseOrder());
        reverseTree.put("Banana", 1);
        reverseTree.put("Apple", 2);
        reverseTree.put("Mango", 3);

        System.out.println(reverseTree); // Sorted in reverse

        // ✅ Common Map methods
        System.out.println("\n🔍 Common Map Methods:");
        System.out.println("Has key 'Saiful'? " + hashMap.containsKey("Saiful"));
        System.out.println("Value for 'Hasan': " + hashMap.get("Hasan"));
        System.out.println("All keys: " + hashMap.keySet());
        System.out.println("All values: " + hashMap.values());
        System.out.println("Entry Set:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // ✅ Modify and remove
        hashMap.putIfAbsent("Raihan", 77); // Only adds if key doesn't exist
        hashMap.replace("Hasan", 95);      // Replace existing value
        hashMap.remove("Nayeem");          // Remove entry

        System.out.println("\n🛠️ Modified HashMap: " + hashMap);

        // ✅ Size and clear
        System.out.println("Map size: " + hashMap.size());
        hashMap.clear();
        System.out.println("Is map empty? " + hashMap.isEmpty());
    }
}
