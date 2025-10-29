package com.yordanos_bekele.springassignment.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yordanos_bekele.springassignment.Entity.SurveyRequest;
import com.yordanos_bekele.springassignment.Repository.SurveyRequestRepository;
import com.yordanos_bekele.springassignment.dto.SurveyReposeDto;
import com.yordanos_bekele.springassignment.dto.SurveyRequestDto;
import com.yordanos_bekele.springassignment.mapper.*;

import jakarta.validation.Valid;

@Service
public class SurveyRequestService {

    private final SurveyRequestRepository repository;
    private final SurveyMapper surveyMapper;
    public SurveyRequestService(SurveyRequestRepository repository , SurveyMapper surveyMapper){
        this.repository = repository;
        this.surveyMapper = surveyMapper;
    }

    public SurveyReposeDto createSurvey(SurveyRequestDto request){
        SurveyRequest newSurvey = surveyMapper.toEntity(request);
        

        SurveyRequest savedSurvey = repository.save(newSurvey);
        return surveyMapper.toResponse(savedSurvey);
    }
    public List<SurveyRequest> getAllSurveys() {
        return repository.findAll();
    }
    public void deleteSurvey(UUID id) {
        if (!repository.findById(id).isPresent()) {
            throw new RuntimeException("Survey not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
