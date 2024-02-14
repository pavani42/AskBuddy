FROM openjdk:17-jdk-slim
EXPOSE 8083
ADD target/question-0.0.1-SNAPSHOT.jar question-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/question-0.0.1-SNAPSHOT.jar"]