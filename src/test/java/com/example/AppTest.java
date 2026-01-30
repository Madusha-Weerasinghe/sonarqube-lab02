package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

    @Test
    public void testMainSuccess() {
        
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    public void testAppConstructor() {
        
        assertDoesNotThrow(() -> new App());
    }
}