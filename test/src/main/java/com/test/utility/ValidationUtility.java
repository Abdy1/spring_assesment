package com.test.utility;
import com.test.exception.ResourceNotFoundException;
import com.test.model.Survey;
import com.test.repository.SmsSurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ValidationUtility {
    private final SmsSurveyRepository smsSurveyRepository;
    public Survey getSurveyById(UUID id) {
        return smsSurveyRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Survey not found" + " " + "id:" + id));
    }
}
