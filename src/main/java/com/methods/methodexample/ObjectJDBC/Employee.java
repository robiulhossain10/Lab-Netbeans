package com.methods.methodexample.ObjectJDBC;

import java.time.LocalDate;

public class Employee {
   private int id;
   private String name;
   private double salary;
   private LocalDate date;
   private String address;
    
    public Employee(){};

    public Employee(int id, String name, double salary, LocalDate date, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
