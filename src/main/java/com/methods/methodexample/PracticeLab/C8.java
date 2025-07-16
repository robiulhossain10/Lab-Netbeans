package com.methods.methodexample.PracticeLab;

/**
 *
 * @author A-3
 */
public class C8 {
    public static void main(String[] args) {
        Student std = new Student();
        Student std1 = new Student(189, "RakibRakibHoss"); // 7-digit string ID
        
        System.out.println("ID: " + std1.getId());
        System.out.println("Name: " + std1.getName());
        
        std.searchThePakna();
    }
}
