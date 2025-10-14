package com.test.mapper;


import com.test.dto.SmsSurveyRequest;
import com.test.dto.SmsSurveyResponse;
import com.test.dto.SmsSurveyStatusRequest;
import com.test.enums.Status;
import com.test.model.Survey;

public class SmsSurveyMapper {
    public static Survey mapToEntity(SmsSurveyRequest request) {
        Survey smsSurvey = new Survey();
        smsSurvey.setMessage(request.getMessage());
        smsSurvey.setPhoneNumber(request.getPhoneNumber());
        smsSurvey.setStatus(Status.PENDING);
        return smsSurvey;
    }


    public static SmsSurveyResponse mapToDto(Survey smsSurvey){
        SmsSurveyResponse response = new SmsSurveyResponse();
        response.setId(smsSurvey.getId());
        response.setMessage(smsSurvey.getMessage());
        response.setPhoneNumber(smsSurvey.getPhoneNumber());
        response.setStatus(smsSurvey.getStatus());
        return response;

    }
    public static Survey updateProduct(Survey smsSurvey, SmsSurveyStatusRequest request){
      if(request.getStatus() != null){
          smsSurvey.setStatus(request.getStatus());
      }

      return smsSurvey;
    }

}
