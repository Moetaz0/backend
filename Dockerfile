FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/spring-jpa-REST-0.0.1-SNAPSHOT.jar spring-jpa-REST.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-jpa-REST.jar"]
ENV DATABASE_URL=jdbc:mysql://localhost:3306/incidents
ENV DATABASE_USERNAME=root
