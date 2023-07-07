FROM maven:3.9.0-eclipse-temurin-17-alpine as build
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:11
COPY --from=build /target/onlineshop-0.0.1-SNAPSHOT.jar onlineshop-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","onlineshop-0.0.1-SNAPSHOT.jar"]