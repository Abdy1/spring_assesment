package com.test.controller;
import com.test.dto.SmsSurveyRequest;
import com.test.dto.SmsSurveyResponse;
import com.test.dto.SmsSurveyStatusRequest;
import com.test.service.SurveyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("survey")
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyService surveyService;

    @GetMapping("/get-all")
    public ResponseEntity<List<SmsSurveyResponse>> getAllSurveys(){
        return ResponseEntity.ok(surveyService.getAllSurveys());
    }
    @PostMapping("/create")
    public ResponseEntity<SmsSurveyResponse> createSurvey(@Valid  @RequestBody SmsSurveyRequest request){
        return ResponseEntity.ok(surveyService.addSurvey(request));

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<SmsSurveyResponse> updateSurveyStatus(@PathVariable("id") UUID id,
                                                           @Valid  @RequestBody SmsSurveyStatusRequest request){
        return ResponseEntity.ok(surveyService.updateSurvey(id, request));
    }

    @GetMapping("get/{id}")
    public ResponseEntity<SmsSurveyResponse> getSurveyById(@PathVariable("id") UUID id){
        return ResponseEntity.ok(surveyService.getSurveyById(id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable("id") UUID id){
        surveyService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }


}
