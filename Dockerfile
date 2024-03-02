FROM openjdk:17
EXPOSE 8080
ADD target/docker-jenkins-integration-sample-app.jar docker-jenkins-integration-sample-app.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration-sample-app.jar"]