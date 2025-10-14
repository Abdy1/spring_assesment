package com.test.repository;

import com.test.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository
public interface SmsSurveyRepository extends JpaRepository<Survey, UUID> {

}
