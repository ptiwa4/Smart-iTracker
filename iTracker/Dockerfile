FROM openjdk:13-jdk-alpine
MAINTAINER innovar.in
VOLUME /tmp
EXPOSE 8080
ADD build/libs/iTracker-0.0.1-SNAPSHOT.jar iTracker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/iTracker.jar"]