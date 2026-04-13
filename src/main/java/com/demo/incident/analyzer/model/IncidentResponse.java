package com.demo.incident.analyzer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncidentResponse {
    private String error;
    private String severity;
    private String rootCause;
    private List<String> similarIncidents;
    private String suggestedFix;
    private String aiConfidence;
}
