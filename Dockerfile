FROM openjdk:17-jdk-slim

COPY ./target/simple-movie-api-0.0.1-SNAPSHOT.jar /

EXPOSE 8080

CMD ["java", "-jar", "simple-movie-api-0.0.1-SNAPSHOT.jar"]