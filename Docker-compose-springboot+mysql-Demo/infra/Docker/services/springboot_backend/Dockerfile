FROM maven:3.5.2-jdk-8-alpine
RUN mkdir /build
RUN mkdir /volume
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package -Dmaven.test.skip=true
RUN ls /build/target