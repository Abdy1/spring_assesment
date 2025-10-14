package com.test.service;
import com.test.dto.SmsSurveyRequest;
import com.test.dto.SmsSurveyResponse;
import com.test.dto.SmsSurveyStatusRequest;
import com.test.mapper.SmsSurveyMapper;
import com.test.model.Survey;
import com.test.repository.SmsSurveyRepository;
import com.test.utility.ValidationUtility;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SurveyService {
  private final SmsSurveyRepository smsSurveyRepository;
  private final ValidationUtility validationUtility;

  public SmsSurveyResponse addSurvey(SmsSurveyRequest request) {
      Survey product  =smsSurveyRepository.save(SmsSurveyMapper.mapToEntity(request));
      return SmsSurveyMapper.mapToDto(smsSurveyRepository.save(product));
  }

  public SmsSurveyResponse updateSurvey(UUID id, SmsSurveyStatusRequest request) {
      Survey product = validationUtility.getSurveyById(id);
      Survey updateProduct = SmsSurveyMapper.updateProduct(product, request);
      return SmsSurveyMapper.mapToDto(smsSurveyRepository.save(updateProduct));
  }

  public List<SmsSurveyResponse> getAllSurveys() {
      List<Survey> products = smsSurveyRepository.findAll();
      return products.stream().map(SmsSurveyMapper::mapToDto).toList();
  }

  public SmsSurveyResponse getSurveyById(UUID id) {
      Survey product = validationUtility.getSurveyById(id);
      return SmsSurveyMapper.mapToDto(product);
  }

  public void deleteProduct(UUID id) {
      Survey product = validationUtility.getSurveyById(id);
      smsSurveyRepository.delete(product);
  }



}
