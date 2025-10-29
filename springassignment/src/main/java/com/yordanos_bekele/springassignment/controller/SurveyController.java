package com.yordanos_bekele.springassignment.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public ResponseEntity<Optional<SurveyReposeDto>> getSurveyById(@PathVariable UUID id) {
        Optional<SurveyReposeDto> survey = surveyRequestService.getSurveyById(id);
        return ResponseEntity.ok(survey);
    }

}
