package com.yordanos_bekele.springassignment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    private final SurveyRequestService surveyRequestService;

    public SurveyController(SurveyRequestService surveyRequestService){
        this.surveyRequestService = surveyRequestService;
    }

    @PostMapping
    public ResponseEntity<SurveyReposeDto> createSurvey(@Valid @RequestBody SurveyRequest request){
        SurveyResponseDto response = surveyRequestService.createSurvey(request);
        return ResponseEntity.ok(response);
    }

}
