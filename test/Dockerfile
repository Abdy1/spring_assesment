# Build Stage
FROM maven:3.9.0 AS build
WORKDIR /app
COPY ../ /app
WORKDIR /app/complaint-service
RUN mvn clean install -DskipTests

# Runtime Stage
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/complaint-service/target/app.jar /app/
EXPOSE 8196
ENTRYPOINT ["java", "-jar", "app.jar"]