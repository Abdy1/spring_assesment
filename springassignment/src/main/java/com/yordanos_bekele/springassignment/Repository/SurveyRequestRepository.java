package com.yordanos_bekele.springassignment.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yordanos_bekele.springassignment.Entity.SurveyRequest;

public interface SurveyRequestRepository extends JpaRepository<SurveyRequest, UUID> {
}
