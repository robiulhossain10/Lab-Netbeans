package com.methods.methodexample.JDBCProjectExample;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentCrudApp {

    public static void createEmployeeNew(Students emp) {
        String sql = "INSERT INTO students (first_name, last_name, email, gender,dob,created_at,is_deleted) VALUES (?, ?, ?, ?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = ConnectsDB.getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, emp.getFirst_name());
            pstmt.setString(2, emp.getLast_name());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getGender().name());
            pstmt.setDate(5, Date.valueOf(emp.getDob()));
            pstmt.setTimestamp(6, Timestamp.valueOf(emp.getCreated_at()));
            pstmt.setBoolean(7, emp.get_Is_deleted());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                pstmt.close();
            } catch (SQLException e) {
            }

        }
    }

//    public static Students readEmployeeById(long id) {
//        String sql = "SELECT * FROM students WHERE eid = ?";
//        try {
//            Connection conn = ConnectsDB.getConnection();
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setLong(1, id);
//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()) {
//                return mapToEmployee(rs);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static List<Students> readAllEmployees() {
//        String sql = "SELECT * FROM students";
//        List<Students> stList = new ArrayList<>();
//        try {
//            Connection conn = ConnectsDB.getConnection();
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();//10
//            while (rs.next()) {
//                stList.add(mapToEmployee(rs));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return stList;
//    }
//
//    public static void updateEmployee(Students emp) {
//        String sql = "UPDATE students SET ename=?, salary=?, hire_date=?, address=? WHERE eid=?";
//
//        try (Connection conn = ConnectsDB.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
//
//            pstmt.setString(1, emp.getEname());
//            pstmt.setDouble(2, emp.getSalary());
//            pstmt.setDate(3, Date.valueOf(emp.getHireDate()));
//            pstmt.setString(4, emp.getAddress());
//            pstmt.setLong(5, emp.getEid());
//
//            pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void deleteEmployee(int id) {
//        String sql = "DELETE FROM students WHERE eid=?";
//
//        try (Connection conn = ConnectsDB.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
//
//            pstmt.setInt(1, id);
//            pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    // 🔁 Reusable mapping method
//    private static Students mapToEmployee(ResultSet rs) throws SQLException {
//        return new Students(
//                rs.getLong("id"),
//                rs.getString("first_name"),
//                rs.getString("last_name"),
//                rs.getString("email"),
//                rs.getString("gender").charAt(0),
//                rs.getDate("dob").toLocalDate(),
//                rs.("created_at"),
//                rs.getString("is_deleted")
//        );
//    }
    public static void main(String[] args) {

        // ✅ Create a new employee
        Students emp = new Students("Robiul", "Hossain", "robiul@gmail.com", Gender.MALE, LocalDate.of(2023, 5, 5), LocalDateTime.now(), true);
        StudentCrudApp.createEmployeeNew(emp);

//        // ✅ Read all employees
//        List<Students> list = StudentCrudApp.readAllEmployees();
//        for (Students e : list) {
//            System.out.println(e.toString());
//        }
//
//        // ✅ Read by ID
//        Students found = StudentCrudApp.readEmployeeById(7);
//        if (found != null) {
//            System.out.println("Found: " + found.toString());
//        }
//
//        // ✅ Update employee
//        if (found != null) {
//            found.setSalary(95000.0);
//            StudentCrudApp.updateEmployee(found);
//        }
//
//        // ✅ Delete employee
//        StudentCrudApp.deleteEmployee(5);
    }
}
