FROM adoptopenjdk/openjdk11:alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]