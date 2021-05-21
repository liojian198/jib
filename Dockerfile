FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/jibdemo-1.0.0.jar jibdemo.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","/jibdemo.jar"]