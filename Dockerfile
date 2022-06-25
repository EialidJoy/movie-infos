FROM openjdk:11

EXPOSE 8082
ADD target/movie-info-docker.jar movie-info-docker.jar
ENTRYPOINT ["java", "-jar", "/movie-info-docker.jar"]