package com.test.model;
import com.test.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "survey")
public class Survey {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false,unique = true)
    private UUID id;


    @Column(nullable = false, unique = true)
    @Pattern(regexp = "^\\+[1-9]\\d{7,14}$", message = "Phone number must be in the format +1234567890")
    private String phoneNumber;


    @Column(nullable = false, length = 160)
    private String message;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false )
    private Status status;
}
