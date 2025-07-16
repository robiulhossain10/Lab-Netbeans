/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.EmployeeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author A-3
 */
public class TestMain{
    public static void main(String[] args) {
//        EmployeesEX emp1 = new EmployeesEX("Robiul",20000.00,"Matuail,Dhaka");
//        EmployeesEX emp2 = new EmployeesEX("Fahim",30000.00,"Khilgaon,Dhaka");
//        EmployeesEX emp3 = new EmployeesEX("Rakib",20000.00,"Bangla Motor,Dhaka");
//        EmployeesEX emp4 = new EmployeesEX("Jashim",20000.00,"Rajdhani Market,Dhaka");
//        EmployeesEX emp5 = new EmployeesEX("Sams",40000.00,"Mogbazar,Dhaka");
//        EmployeesEX emp6 = new EmployeesEX("Karim",80000.00,"Rampura,Dhaka");
//        EmployeesEX emp7 = new EmployeesEX("Rahim",50000.00,"Hatirjheel,Dhaka");
//        EmployeesEX emp8 = new EmployeesEX("Anik",90000.00,"Badda,Dhaka");
//        EmployeesEX emp9 = new EmployeesEX("Monisha",40000.00,"Puran Dhaka");
//        EmployeesEX emp10 = new EmployeesEX("Aurpa",70000.00,"Matuail,Dhaka");
        
        List<EmployeesEX> empdata = Arrays.asList(
                new EmployeesEX ("Robiul",20000.00,"Matuail,Dhaka"),
                new EmployeesEX ("Fahim",30000.00,"Khilgaon,Dhaka"),
                new EmployeesEX ("Rakib",20000.00,"Bangla Motor,Dhaka"),
                new EmployeesEX ("Jashim",20000.00,"Rajdhani Market,Dhaka"),
                new EmployeesEX ("Sams",40000.00,"Mogbazar,Dhaka"),
                new EmployeesEX("Karim",80000.00,"Rampura,Dhaka"),
                new EmployeesEX("Rahim",50000.00,"Hatirjheel,Dhaka"),
                new EmployeesEX("Anik",90000.00,"Badda,Dhaka"),
                new EmployeesEX("Monisha",40000.00,"Puran Dhaka"),
                new EmployeesEX("Aurpa",70000.00,"Matuail,Dhaka")
                
        );
        System.out.println("Before Arrays: " + empdata);
//        empdata.sort(Comparator.comparingDouble((EmployeesEX e) -> e.getSalary()).reversed().
//                thenComparing(e -> e.getName()).reversed());
        
       
                  Collections.sort(empdata, (a,b) -> {
                      if (a.getSalary() != b.getSalary()) {
                          return Double.compare(a.getSalary(), b.getSalary());
                      }else{
                          return b.getName().compareTo(a.getName());
                      }
                  });
          
        
        System.out.println("After Arrays: " + empdata);
        

        
    }
}
