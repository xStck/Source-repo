FROM eclipse-temurin:17.0.4.1_1-jre-alpine
EXPOSE 80
ADD build/libs/app.jar app.jar
ENTRYPOINT java ${JAVA_OPTS} -jar app.jar
