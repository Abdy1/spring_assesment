package com.test.dto;
import com.test.enums.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsSurveyStatusRequest {

    @Enumerated(EnumType.STRING)
    @NotNull(message = "the status cannot be null" )
    private Status status;
}
