package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    // Defined a logger for the class
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) { 
        try {
            Calculator calc = new Calculator(); 
            String result = String.valueOf(calc.calculate(10, 5, "add-again"));
            
            // Replaced System.out with logger
            logger.log(Level.INFO, "Calculation Result: {0}", result); 
            
            UserService service = new UserService(); 
            service.findUser("admin"); 
            service.deleteUser("admin"); 
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred in the application", e);
        }
    } 
}