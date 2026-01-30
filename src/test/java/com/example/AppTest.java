package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

    @Test
    public void testMain() {
        
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}