package com.test.dto;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsSurveyRequest {


    @NotBlank(message = "the phone number is required")
    @Pattern(regexp = "^\\+[1-9]\\d{7,14}$", message = "Phone number must be in the format +1234567890")
    private String phoneNumber;

    @NotBlank(message = "the message  is required")
    private String message;


}
