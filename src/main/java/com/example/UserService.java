package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    private String password = "admin123";
    private String url = "jdbc:mysql://localhost/db";

    public void findUser(String username) throws SQLException {
        String query = "SELECT * FROM users WHERE name = '" + username + "'";
        
        // Try-with-resources closes resources automatically
        try (Connection conn = DriverManager.getConnection(url, "root", password);
             Statement st = conn.createStatement()) {
            st.executeQuery(query);
        }
    }

    public void deleteUser(String username) throws SQLException { 
        String query = "DELETE FROM users WHERE name = '" + username + "'"; 
        
        try (Connection conn = DriverManager.getConnection(url, "root", password);
             Statement st = conn.createStatement()) {
            st.execute(query);
        }
    }

    public void notUsed() {
        // SonarQube will flag this as an unused method smell
    }
}