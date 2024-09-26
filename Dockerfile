# FROM openjdk:21-jdk-alpine
FROM openjdk:21-jdk

ARG JAR_FILE=build/libs/*.jar

# RUN addgroup -S sysspring && adduser -S sysspring -G sysspring
# USER sysspring:sysspring

# You should build your application before creating a new image.
COPY ${JAR_FILE} app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]