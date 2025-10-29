package com.safaricom.sms_survey_api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safaricom.sms_survey_api.service.SurveyService;

@RestController
public class SurveyApi {

    @Autowired
    SurveyService surveyService;

    @GetMapping("/all")
    public ResponseEntity<List<Survey>> getAllSurveys(){
        return ResponseEntity.ok(surveyService.getAllSurveys());       
    }

    @GetMapping("/survey{id}")
    public ResponseEntity<Survey> getSurveyById(@param String id){
        return ResponseStatus.ok(surveyService.getSurveyById(id));
    }

    @PostMapping("/createSurvey")
    public ResponseEntity createSurvey(RequestBody Survey survey){
        return ResponseStatus.created(surveyService.createSurvey(survey));
    }

    @PutMapping("/updateSurvey")
    public ResponseEntity<Survey> updateSurvey(RequestBody Survey survey){
        return ResponseEntity.ok(surveyService.updateSurvey(survey));
    }

    @DeleteMapping("/deleteSurvey")
    public ResponseEntity deleteSurvey(RequestBody Survey survey){
        return ResponseEntity.ok(surveyService.deleteSurvey(survey));
    }
    
}
