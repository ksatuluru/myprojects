FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/restserviceproject-0.0.2-SNAPSHOT.jar restserviceproject-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /restserviceproject-0.0.2-SNAPSHOT.jar"]