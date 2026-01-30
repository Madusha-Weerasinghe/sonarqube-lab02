package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) { 
        try {
            Calculator calc = new Calculator(); 
            // Using logger instead of System.out
            logger.log(Level.INFO, "Result: {0}", calc.calculate(10, 5, "add-again")); 
            
            UserService service = new UserService(); 
            service.findUser("admin"); 
            service.deleteUser("admin"); 
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Application error", e);
        }
    } 
}