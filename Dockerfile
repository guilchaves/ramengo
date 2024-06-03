FROM ubuntu:latest
LABEL authors="guilherme"

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY .idea .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:21-jdk-slim

EXPOSE 8080

COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]