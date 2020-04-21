FROM maven:3.5.2-jdk-8-alpine

LABEL MAINTAINER="Renil Raphy"

WORKDIR /build/

ADD src/springboot+mysql_backend/ /build/

RUN mvn package -Dmaven.test.skip=true

ENTRYPOINT ["java", "-jar", "target/docker-demo.jar"]