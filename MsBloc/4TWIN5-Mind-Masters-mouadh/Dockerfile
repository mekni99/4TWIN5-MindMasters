FROM openjdk:17
EXPOSE 8089
ADD target/MsBloc-0.0.1-SNAPSHOT.jar MsBloc-docker.jar
ENTRYPOINT ["java", "-jar","MsBloc-docker.jar"]