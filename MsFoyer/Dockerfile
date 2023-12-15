FROM openjdk:17
EXPOSE 8084
ADD target/MsFoyer-0.0.1-SNAPSHOT.jar msfoyer-docker.jar
ENTRYPOINT ["java" , "-jar", "msfoyer-docker.jar"]