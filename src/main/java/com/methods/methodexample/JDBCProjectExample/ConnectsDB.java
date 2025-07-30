package com.methods.methodexample.JDBCProjectExample;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectsDB {

    // === PostgreSQL Configuration ===
    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL = dotenv.get("DB_URL2");
    private static final String DB_USER = dotenv.get("DB_USERNAME2");
    private static final String DB_PASS = dotenv.get("DB_PASSWORD2");

    private static Connection connection;

    // Private constructor to prevent instantiation
    private ConnectsDB() {
    }

    /**
     * Returns a singleton connection object. Loads the appropriate driver if
     * not already loaded.
     */
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                System.out.println("✅ Connected to the database.");
            } catch (ClassNotFoundException e) {
                System.err.println("❌ JDBC Driver not found: ");
                e.printStackTrace();
            }
        }
        return connection;
    }

    // === Resource Cleanup Methods ===
    /**
     * Closes the given Connection object.
     */
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("🔌 Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Closes the given Statement object.
     */
    public static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
                System.out.println("🧹 Statement closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Closes the given ResultSet object.
     */
    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                System.out.println("🧾 ResultSet closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Closes all three resources: Connection, Statement, and ResultSet.
     */
    public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
        close(rs);
        close(stmt);
        close(conn);
    }
}
