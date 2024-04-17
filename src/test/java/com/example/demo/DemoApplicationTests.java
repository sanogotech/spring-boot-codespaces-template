package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
//@ActiveProfiles("test") // Optional: Use this if you have specific configurations for the test environment.
public class DemoApplicationTests {

    @Autowired
    private ApplicationContext context; // Auto-injected application context

    @Test
    void contextLoads() {
        // This test simply checks if the Spring context loads without any issues.
        assert context != null; // Simple assertion to ensure the context is not null.
    }
}
