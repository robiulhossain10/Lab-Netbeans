package com.methods.methodexample.JDBC;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public class DBConnection {

    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL = dotenv.get("DB_URL2");
    private static final String DB_USER = dotenv.get("DB_USERNAME2");
    private static final String DB_PASS = dotenv.get("DB_PASSWORD2");

    private static Connection connection;

    // Private constructor to prevent instantiation
    private DBConnection() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                System.out.println("Connected to the database.");
            } catch (ClassNotFoundException e) {
                System.err.println("PostgreSQL JDBC Driver not found.");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
