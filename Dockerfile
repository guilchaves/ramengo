FROM ubuntu:latest AS build

RUN apt-get update

RUN apt-get install wget -y
RUN wget https://download.java.net/java/GA/jdk21/latest/binaries/openjdk-21_linux-x64_bin.tar.gz
RUN mkdir /opt/jdk
RUN tar -xzf openjdk-21_linux-x64_bin.tar.gz -C /opt/jdk

ENV JAVA_HOME=/opt/jdk/jdk-21
ENV PATH=$JAVA_HOME/bin:$PATH

RUN java -version

COPY . .

RUN apt-get install maven -y

RUN mvn clean install

FROM ubuntu:latest

COPY --from=build /opt/jdk/jdk-21 /opt/jdk/jdk-21
ENV JAVA_HOME=/opt/jdk/jdk-21
ENV PATH=$JAVA_HOME/bin:$PATH

EXPOSE 8080

COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]