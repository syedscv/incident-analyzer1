package com.demo.incident.analyzer.service;

import com.demo.incident.analyzer.model.IncidentResponse;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AnalysisService {

    public IncidentResponse analyze(String log) {

        IncidentResponse response = new IncidentResponse();

        if (log.contains("NullPointerException")) {
            response.setError("NullPointerException");
            response.setSeverity("HIGH");
            response.setRootCause("Object not initialized");
            response.setSimilarIncidents(List.of("INC1001", "INC1002"));
            response.setSuggestedFix("Add null checks or initialize object");
            response.setAiConfidence("92%");
        } else if (log.contains("Timeout")) {
            response.setError("TimeoutException");
            response.setSeverity("MEDIUM");
            response.setRootCause("Service took too long to respond");
            response.setSuggestedFix("Increase timeout or optimize API");
            response.setAiConfidence("85%");
        } else if (log.contains("OutOfMemory")) {
            response.setError("OutOfMemoryError");
            response.setSeverity("CRITICAL");
            response.setRootCause("Heap memory exhausted");
            response.setSuggestedFix("Increase heap size or optimize memory usage");
            response.setAiConfidence("95%");
        } else if (log.toLowerCase().contains("connection refused") ||
                log.toLowerCase().contains("could not connect") ||
                log.toLowerCase().contains("jdbc") ||
                log.toLowerCase().contains("db connection")) {

            response.setError("DatabaseConnectionException");
            response.setSeverity("CRITICAL");
            response.setRootCause("Unable to connect to database");
            response.setSimilarIncidents(List.of("INC2001", "INC2002"));
            response.setSuggestedFix("Check DB service status, credentials, and network connectivity");
            response.setAiConfidence("94%");
        } else if (log.toLowerCase().contains("timeout connecting to database") ||
                log.toLowerCase().contains("connection pool exhausted")) {

            response.setError("DatabaseTimeoutException");
            response.setSeverity("HIGH");
            response.setRootCause("Database connection pool exhausted or slow DB response");
            response.setSuggestedFix("Increase pool size or optimize DB queries");
            response.setAiConfidence("90%");
        }
        else {
            response.setError("Unknown");
            response.setSeverity("LOW");
            response.setRootCause("Needs further analysis");
            response.setSuggestedFix("Check logs manually");
            response.setAiConfidence("60%");
        }

        return response;
    }
}