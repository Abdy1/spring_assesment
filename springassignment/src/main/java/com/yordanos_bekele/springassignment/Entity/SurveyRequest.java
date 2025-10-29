package com.yordanos_bekele.springassignment.Entity;

import java.util.UUID;

import com.yordanos_bekele.springassignment.Enums.status.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SurveyRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String title;
    private String phone;
    private String message;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
