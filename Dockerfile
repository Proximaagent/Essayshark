FROM maven:3.6.2-jdk-11 AS builder
WORKDIR /home/sources
COPY ../essaysharproject /home/sources/
RUN mvn clean install -Dmaven.test.skip=true -f /home/sources/essaysharproject

FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1-alpine-slim
COPY  --from=builder /home/sources/essaysharproject/target/essaysharproject.jar essaysharproject.jar
ENTRYPOINT ["java", "-jar","essaysharproject.jar"]