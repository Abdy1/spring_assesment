package com.safaricom.sms_survey_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safaricom.sms_survey_api.entity.Survey;

import jakarta.persistence.Id;

public interface SurveyRepository extends JpaRepository<Survey,Id>{
}
