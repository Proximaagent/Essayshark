FROM maven:3.6.2-jdk-11 AS builder
WORKDIR /home/sources
COPY ./* /home/sources/Essayshark/
# RUN mvn clean install -f /home/sources/Essayshark
FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1-alpine-slim
COPY  --from=builder /home/sources/Essayshark/target/Essayshark.jar Essayshark.jar
ENTRYPOINT ["java", "-jar", "/Essayshark/target/Essayshark.jar"]