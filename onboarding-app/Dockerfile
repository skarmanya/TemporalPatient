FROM maven:3.6.0-jdk-11-slim AS build

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-app"

COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn /home/app/pom.xml clean package clean install quarkus:dev

EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "onboarding-app.jar"]