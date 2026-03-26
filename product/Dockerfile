FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8084
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]