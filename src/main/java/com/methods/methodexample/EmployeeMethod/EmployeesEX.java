/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.EmployeeMethod;

/**
 *
 * @author A-3
 */
public class EmployeesEX {
    private String name;
    private Double salary;
    private String address;

    public EmployeesEX(String name, Double salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmployeesEX{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
    
    
}
