FROM maven:3.6.0-jdk-11-slim AS build

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-Service"

COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn  /home/app/pom.xml clean package clean install quarkus:dev

# FROM openjdk:11


# COPY /target/onboarding-service-0.0.1-SNAPSHOT.jar onboarding-service.jar

EXPOSE 9000

# ENTRYPOINT ["java", "-jar", "onboarding-service.jar"]