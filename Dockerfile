FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /target/spring-jpa-REST-0.0.1-SNAPSHOT.jar spring-jpa-REST.jar
COPY src/main/resources/application.properties /app/application.properties
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-jpa-REST.jar"]
