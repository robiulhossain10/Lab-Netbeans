/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.incapsulation;

import java.time.LocalDate;

/**
 *
 * @author A-3
 */
public class StudentData {
    public static void main(String[] args) {
        Student std1 = new Student();
        
        
        std1.setId(1001);
        std1.setName("Robiul Hossain");
        std1.setAddress("Matuail Dhaka");
        std1.setDepartments("Management");
        std1.setAge(26);
        std1.setDob(LocalDate.now());
        std1.accessData();
        
    }
}
