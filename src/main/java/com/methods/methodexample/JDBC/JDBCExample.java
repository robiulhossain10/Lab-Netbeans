package com.methods.methodexample.JDBC;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public class JDBCExample {

    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL2 = dotenv.get("DB_URL2");
    private static final String DB_USER2 = dotenv.get("DB_USERNAME2");
    private static final String DB_PASS2 = dotenv.get("DB_PASSWORD2");

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;     
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver"); 

            conn = DriverManager.getConnection(DB_URL2, DB_USER2, DB_PASS2);
            System.out.println("Connected to PostgreSQL");

            // Update query
            String updateSQL = "UPDATE public.users SET name = ?, email = ? WHERE id = ?";
            PreparedStatement psmt = conn.prepareStatement(updateSQL);
            psmt.setString(1, "New Hashset");
            psmt.setString(2, "newemail@example.com");
            psmt.setInt(3, 4);

            int rowsUpdated = psmt.executeUpdate();
            System.out.println("Updated rows: " + rowsUpdated);

            // Select query
            String selectSQL = "SELECT * FROM public.users";
            PreparedStatement pstmtr = conn.prepareStatement(selectSQL);
            rs = pstmtr.executeQuery();

            System.out.println("Users in DB:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id")
                        + " Name: " + rs.getString("name")
                        + " Email: " + rs.getString("email"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("SQL Exception Generated");
            e.printStackTrace();
        } finally {
            // Resource closing: important to avoid resource leaks
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close(); // stmt এখানে null, তুমি চাইলে বাদ দিতে পারো
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
