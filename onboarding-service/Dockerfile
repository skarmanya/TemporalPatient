FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-Service"

COPY /target/onboarding-service-0.0.1-SNAPSHOT.jar onboarding-service.jar

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "onboarding-service.jar"]