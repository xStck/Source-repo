FROM eclipse-temurin:17.0.9_9-jre
EXPOSE 80
ADD build/libs/app.jar app.jar
ENTRYPOINT java ${JAVA_OPTS} -jar app.jar
