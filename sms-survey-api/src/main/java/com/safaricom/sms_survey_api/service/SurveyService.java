package com.safaricom.sms_survey_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safaricom.sms_survey_api.entity.Survey;
import com.safaricom.sms_survey_api.repository.SurveyRepository;

@Service
public class SurveyService {

    @Autowired
    SurveyRepository surveyRepository;

    public void createSurvey(Survey survey){

        surveyRepository.save(survey);
    }

    public List<Survey> getAllSurveys(){
        return surveyRepository.findAll();
    }

    public Survey getSurveyById(String Id){
        return surveyRepository.findById(Id);
    }

    public void updateSurveyStatus(Survey newSurvey){
        Survey existingSurvey = surveyRepository.findById(newSurvey.id);
        existingSurvey.setStatus(newSurvey.getStatus());
        return surveyRepository.updateSurvey(existingSurvey);
    }

    public void deleteSurvey(Survey survey){
        surveyRepository.deleteById(survey.id);
    }
    
}
