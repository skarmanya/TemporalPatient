FROM maven:3.6.0-jdk-11-slim AS build

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-Service"

COPY src /tmp/src/
COPY pom.xml /tmp/
WORKDIR /tmp/

RUN mvn clean install quarkus:dev 

# FROM openjdk:11


# COPY /target/onboarding-service-0.0.1-SNAPSHOT.jar onboarding-service.jar

EXPOSE 9000

# ENTRYPOINT ["java", "-jar", "onboarding-service.jar"]