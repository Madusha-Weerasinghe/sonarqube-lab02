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
    
    String query = "DELETE FROM users WHERE name = ?"; 
    
    try (Connection conn = DriverManager.getConnection(url, "root", password);
         PreparedStatement pstmt = conn.prepareStatement(query)) {
        
        
        pstmt.setString(1, username);
        pstmt.execute();
    }
}

    public void notUsed() {
        // SonarQube will flag this as an unused method smell
    }
}