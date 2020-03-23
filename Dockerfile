FROM openjdk:8-jre-alpine

WORKDIR /

RUN mkdir app && chmod 777 app
COPY target/hello-web-0.0.1-SNAPSHOT.jar /app
WORKDIR /app

EXPOSE 8080

CMD ["java","-jar","hello-web-0.0.1-SNAPSHOT.jar"]