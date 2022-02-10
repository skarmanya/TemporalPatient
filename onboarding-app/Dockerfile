FROM maven:3.6.0-jdk-11-slim AS build

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-app"

COPY src /tmp/src/
COPY pom.xml /tmp/
WORKDIR /tmp/

RUN mvn clean package clean install quarkus:dev

EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "onboarding-app.jar"]