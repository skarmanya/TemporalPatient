FROM maven:3.6.0-jdk-11-slim AS build

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-Model"

COPY src /tmp/src/
COPY pom.xml /tmp/
WORKDIR /tmp/

RUN mvn clean install

# EXPOSE 9010

# ENTRYPOINT ["java", "-jar", "onboarding-model.jar"]