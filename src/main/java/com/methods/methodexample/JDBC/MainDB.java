package com.methods.methodexample.JDBC;

import java.time.LocalDate;

public class MainDB {

    public static void main(String[] args) {
        MyRepository user1 = new MyRepository();

        user1.createEmployee(3, "Karim", 20000, LocalDate.of(2025, 05, 05), "Dhaka");
    }
}
