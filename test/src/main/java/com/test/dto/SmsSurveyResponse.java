package com.test.dto;

import com.test.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsSurveyResponse {

    private UUID id;
    private String phoneNumber;
    private String message;
    private Status status;
}
