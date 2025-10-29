package com.yordanos_bekele.springassignment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yordanos_bekele.springassignment.Entity.SurveyRequest;
import com.yordanos_bekele.springassignment.dto.SurveyReposeDto;
import com.yordanos_bekele.springassignment.dto.SurveyRequestDto;
import com.yordanos_bekele.springassignment.service.SurveyRequestService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    private final SurveyRequestService surveyRequestService;

    public SurveyController(SurveyRequestService surveyRequestService){
        this.surveyRequestService = surveyRequestService;
    }

    @PostMapping
    public ResponseEntity<SurveyReposeDto> createSurvey(@Valid @RequestBody SurveyRequestDto request){
        SurveyReposeDto response = surveyRequestService.createSurvey(request);
        return ResponseEntity.ok(response);
    }

}
