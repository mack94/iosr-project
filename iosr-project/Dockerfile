FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/iosr-project-0.0.1-SNAPSHOT.jar /app.jar

ENV JAVA_OPTS="-Xmx512M"
ENV EUREKA_OPTS="-Deureka.instance.securePort=443 -Deureka.instance.nonSecurePort=80"
CMD exec java $JAVA_OPTS $EUREKA_OPTS -Dsecurity.user.password=$PASSWORD -Dserver.port=$PORT -Deureka.instance.hostname=$HOST_NAME -Djava.security.egd=file:/dev/./urandom -jar /app.jar