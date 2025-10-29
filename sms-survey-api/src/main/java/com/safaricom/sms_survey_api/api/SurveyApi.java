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
    public RequestMapping getAllSurveys(){
        return RequestStatus.ok(surveyService.getAllSurveys());       
    }

    @PostMapping("/createSurvey")
    public RequestMapping createSurvey(RequestBody Survey survey){
        return RequestStatus.created(surveyService.createSurvey(survey));
    }

    @PutMapping("/updateSurvey")
    public RequestMapping updateSurvey(RequestBody Survey survey){
        return RequestStatus.ok(surveyService.updateSurvey(survey));
    }

    @DeleteMapping("/deleteSurvey")
    public RequestMapping deleteSurvey(RequestBody Survey survey){
        return RequestStatus.ok(surveyService.deleteSurvey(survey));
    }
    
}
