package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    private String password = "admin123";
    private final String dbUrl = "jdbc:mysql://localhost/db";

    // Replaced generic Exception with SQLException
    public void findUser(String username) throws SQLException {
        String query = "SELECT * FROM users WHERE name = '" + username + "'";

        // Try-with-resources ensures both Connection and Statement are closed automatically
        try (Connection conn = DriverManager.getConnection(dbUrl, "root", password);
             Statement st = conn.createStatement()) {
            
            st.executeQuery(query);
        }
    }

    public void deleteUser(String username) throws SQLException { 
        String query = "DELETE FROM users WHERE name = '" + username + "'"; 

        try (Connection conn = DriverManager.getConnection(dbUrl, "root", password);
             Statement st = conn.createStatement()) {
            
            st.execute(query);
        }
    }

    public void notUsed() {
        // This will still trigger a SonarQube "Unused Method" smell
    }
}