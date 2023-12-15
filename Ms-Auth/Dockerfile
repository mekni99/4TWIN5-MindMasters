FROM openjdk:17
EXPOSE 8089
ADD target/demo-0.0.1-SNAPSHOT.jar auth-docker.jar
ENTRYPOINT ["java" , "-jar", "auth-docker.jar"]