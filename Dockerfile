FROM openjdk:17-alpine
EXPOSE 8080
ADD target/docker-jenkin-integration-demo.jar docker-jenkin-integration-demo.jar
ENTRYPOINT ["java","-jar","/docker-jenkin-integration-demo.jar"]