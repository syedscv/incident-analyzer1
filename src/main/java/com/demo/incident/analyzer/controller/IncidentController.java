package com.demo.incident.analyzer.controller;

import com.demo.incident.analyzer.model.IncidentRequest;
import com.demo.incident.analyzer.model.IncidentResponse;
import com.demo.incident.analyzer.service.AnalysisService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/incident")
@RequiredArgsConstructor
public class IncidentController {

    private final AnalysisService service;

    @PostMapping("/analyze")
    public ResponseEntity<IncidentResponse> analyze(@RequestBody IncidentRequest request) {
        return ResponseEntity.ok(service.analyze(request.getLog()));
    }

    @GetMapping("/health")
    public String health() {
        return "Incident Analyzer is running";
    }
}