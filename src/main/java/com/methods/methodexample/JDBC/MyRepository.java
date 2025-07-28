
package com.methods.methodexample.JDBC;

import java.sql.*;
import java.time.LocalDate;

public class MyRepository {
    public void createEmployee
        (int id,String name,double salary,LocalDate hire_date,String address){
        String insertSQl = "INSERT INTO EMP(ename,salary,hire_date,address)VALUES(?,?,?,?)";
        ResultSet rs = null;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement psmt = conn.prepareStatement(insertSQl);
            
            psmt.setString(1, "Ayesha");
            psmt.setDouble(2, 55000);
            psmt.setDate(3, Date.valueOf(hire_date));
            psmt.setString(4, "Dhaka");
            
            
            
            rs = psmt.executeQuery();
            
        } catch (SQLException e) {
            System.out.println("Error Generating Data");
            e.printStackTrace();
        }
    }
}
