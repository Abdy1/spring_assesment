package com.safaricom.sms_survey_api.entity;

import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Survey {

    @Generated
    private String id;

    @Required
    @Size(max=14) 
    private String phone_number;

    @Required
    private String message;

    @Required
    private String status;

}
