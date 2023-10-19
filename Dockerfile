# Indichiamo a Docker da dove generare la build con gradle
FROM gradle:8.4.0-jdk17 AS build
# copiamo la configurazione di gradle nel container
COPY --chown=gradle:gradle . /home/gradle/src
# setttiamo la cartella di lavoro per avviare la build
WORKDIR /home/gradle/src
# avviamo la build gradle
RUN gradle build
# Start with a base image containing Java slim runtime
FROM openjdk:17-jdk-slim
# Make port 8080 available to the world outside this container
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/*.jar /app.jar
# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]