FROM openjdk:8-jdk-alpine
ADD target/docker-demo.jar docker-demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar", "docker-demo.jar"]