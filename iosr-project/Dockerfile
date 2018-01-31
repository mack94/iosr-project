FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/iosr-project-0.0.1-SNAPSHOT.jar /app.jar

ENV PORT="1234"
EXPOSE 1234

ENV PASSWORD="andrzej9000"

ENV JAVA_OPTS="-Xmx256M"
ENV EUREKA_URI="http://eureka:8761/eureka/"
#ENV EUREKA_OPTS="-Deureka.instance.securePort=443 -Deureka.instance.nonSecurePort=80"
#-Deureka.instance.hostname=$HOST_NAME 
CMD exec java $JAVA_OPTS -Dsecurity.user.password=$PASSWORD -Dserver.port=$PORT -Djava.security.egd=file:/dev/./urandom -jar /app.jar
