FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Onboarding-app Service"

COPY /target/onboarding-app-0.0.1-SNAPSHOT.jar onboarding-app.jar

EXPOSE 8001

ENTRYPOINT ["java", "-jar", "onboarding-app.jar"]