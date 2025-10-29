Overview

This is a simple Survey Request CRUD application built with Spring Boot.
It allows users to create, read, update, and delete survey requests, including updating the status of surveys.
The application demonstrates the use of Spring Data JPA, Spring Boot REST controllers, DTOs, and validation.

Technologies Used

Java 21

Spring Boot 4.x

Spring Data JPA (Hibernate)

PostgreSQL 

Maven for project management

MapStruct 

Jakarta Validation (@NotBlank, @Pattern, etc.)

Lombok for simplify getter and setter methods


Features

Create Survey: Add a new survey request with validation for fields.

Read Surveys:

Get all surveys

Get a survey by ID

Update Survey: Update the status of an existing survey (PENDING, ACTIVE, CLOSED).

Delete Survey: Remove a survey by ID.

Validation: Ensures required fields are filled and phone numbers follow the international format.