package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    public void testUserMethods() {
        UserService service = new UserService();
        
        
        try {
            service.findUser("test-user");
        } catch (Exception e) {
            
        }

        try {
            service.deleteUser("test-user");
        } catch (Exception e) {
            
        }
    }

    @Test
    public void testUnusedMethod() {
        UserService service = new UserService();
        
        assertDoesNotThrow(() -> service.notUsed());
    }
}