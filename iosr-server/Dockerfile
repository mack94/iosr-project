FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/iosr-eureka-server-1.0.jar /app.jar

ENV PORT="8761"
EXPOSE 8761

ENV JAVA_OPTS="-Xmx512M"
CMD exec java $JAVA_OPTS -Dserver.port=$PORT -Djava.security.egd=file:/dev/./urandom -jar /app.jar
