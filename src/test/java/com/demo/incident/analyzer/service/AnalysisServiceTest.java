package com.demo.incident.analyzer.service;

import com.demo.incident.analyzer.model.IncidentResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnalysisServiceTest {

    @Autowired
    private AnalysisService service;

    @Test
    void testNullPointerException() {
        IncidentResponse response = service.analyze("NullPointerException occurred");

        assertEquals("NullPointerException", response.getError());
        assertEquals("HIGH", response.getSeverity());
    }
}