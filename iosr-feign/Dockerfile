FROM openjdk:8-jdk-alpine

#ADD target/lib /lib

ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar

ENV JAVA_OPTS="-Xmx256M"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
