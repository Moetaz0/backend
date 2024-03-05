FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/spring-jpa-REST-0.0.1-SNAPSHOT.jar spring-jpa-REST.jar
EXPOSE 8080
ENV DB_URL jdbc:mysql://127.0.0.1:3306/incidents?useSSL=false
ENV DB_USERNAME root
ENTRYPOINT ["java","-jar","spring-jpa-REST.jar"]

