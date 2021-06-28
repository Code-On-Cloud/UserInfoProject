FROM openjdk:8
EXPOSE 8080
ADD target/user-info-project.jar user-info-project.jar
ENTRPOINT ["java", "-jar", "/user-info-project.jar"]