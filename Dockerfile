FROM openjdk:8-jre-alpine
ADD build/libs/artifact.jar .
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "artifact.jar"]

