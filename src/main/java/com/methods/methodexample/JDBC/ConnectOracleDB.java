package com.methods.methodexample.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectOracleDB {

    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "system";
    private static final String DB_PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connected to Oracle");

            // Update query
            String updateSQL = "UPDATE emp SET ename = ? WHERE id = ?";
            PreparedStatement psmt = conn.prepareStatement(updateSQL);
            psmt.setString(1, "New Hashset");
            psmt.setDouble(2, 50000);
            psmt.setInt(3, 4);

            int rowsUpdated = psmt.executeUpdate();
            System.out.println("Updated rows: " + rowsUpdated);

            // Select query
            String selectSQL = "SELECT * FROM emp";
            PreparedStatement pstmtr = conn.prepareStatement(selectSQL);
            rs = pstmtr.executeQuery();

            System.out.println("Users in DB:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("eid")
                        + " Name: " + rs.getString("ename")
                        + " Email: " + rs.getString("salary"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("SQL Exception Generated");
            e.printStackTrace();
        } finally {
            // Resource closing: important to avoid resource leaks
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
