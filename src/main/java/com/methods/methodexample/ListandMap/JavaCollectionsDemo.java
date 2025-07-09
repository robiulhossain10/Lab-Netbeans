/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ListandMap;

import java.util.*;

// Demonstrates Collections, List, Iterator, and Comparator in Java
public class JavaCollectionsDemo {

    public static void main(String[] args) {

        // ✅ 1. Collection Interface (using ArrayList)
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Apple");
        fruitCollection.add("Banana");
        fruitCollection.add("Mango");
        fruitCollection.add("Apple"); // Duplicates allowed

        System.out.println("🔹 Collection (ArrayList):");
        for (String fruit : fruitCollection) {
            System.out.println(fruit);
        }

        // ✅ 2. Iterator - used to traverse Collection
        /*
        hasNext(): checks if there's another element.

        next(): gets the next element.

        remove(): removes the current element.
         */
        System.out.println("\n🔹 Iterator:");
        Iterator<String> iterator = fruitCollection.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Iterated: " + fruit);
        }
         
        
        // ✅ 3. List Interface - ordered, allows duplicates, index-based
        List<String> nameList = new ArrayList<>();
        nameList.add("Saiful");
        nameList.add("Hasan");
        nameList.add("Saiful"); // Duplicate
        nameList.add(1, "Raihan"); // Insert at index

        System.out.println("\n🔹 List (with index access):");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Index " + i + ": " + nameList.get(i));
        }

        // ✅ 4. Comparator Interface - custom sorting logic
        List<String> items = Arrays.asList("Kiwi", "Watermelon", "Apple", "Banana");

        System.out.println("\n🔹 Before Sorting (by length):");
        System.out.println(items);

        // Sort strings by length using Comparator
        Collections.sort(items, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        } );
        
        Collections.sort(items, (String s1, String s2) -> Integer.compare(s1.length(), s2.length())); 
        System.out.println("🔹 After Sorting (by length):");
        System.out.println(items);

        // ✅ 5. Comparator with custom class (Student)
        List<Student10> students = new ArrayList<>();
        
        students.add(new Student10("Saiful", 25));
        students.add(new Student10("Hasan", 22));
        students.add(new Student10("Nayeem", 28));

        Collections.sort(students, (Student10 s1, Student10 s2) -> Integer.compare(s1.age, s2.age));
        System.out.println("---------Integer----------" + students);
        Collections.sort(students, (Student10 s1, Student10 s2) -> s1.name.compareTo(s2.name));
        System.out.println("---------String----------" + students);
        
        System.out.println("\n🔹 Students Before Sorting (by age):");
        for (Student10 s : students) {
            System.out.println(s.name + " - " + s.age);
        }

        // Sort students by age using custom Comparator
        Collections.sort(students, new AgeComparator());

        System.out.println("🔹 Students After Sorting (by age):");
        for (Student10 s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}

// ✅ Custom class
class Student10 {

     String name;
     int age;

    Student10(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student10{" + "name=" + name + ", age=" + age + '}';
    }
}

// ✅ Comparator for sorting Students by age
class AgeComparator implements Comparator<Student10> {

    @Override
    public int compare(Student10 s1, Student10 s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
