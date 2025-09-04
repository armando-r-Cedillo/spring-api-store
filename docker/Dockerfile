# ---- build stage ----
#FROM eclipse-temurin:21-jdk AS build
#WORKDIR /app
# Si usas Gradle:
#RUN ./gradlew -q -x test bootJar
FROM openjdk:17

USER root

# Si usas Maven (comenta Gradle y descomenta esto):
# RUN ./mvnw -q -DskipTests package

# ---- run stage ----
# Imagen mínima (sin shell): distroless
#FROM gcr.io/distroless/java21
#WORKDIR /app
WORKDIR /app

# Gradle: el jar queda en build/libs/z
#COPY --from=build /app/build/libs/*.jar /app/app.jar

COPY --chown=1000:1000 build/libs/project-1-0.0.1-SNAPSHOT.jar /app/app.jar
#COPY --chown=1000:1000 /home/arochac/Desarrollo/cursos/github/spring-api-store/build/libs/project-1-0.0.1-SNAPSHOT.jar /app/app.jar
# Maven: sería target/*.jar
# COPY --from=build /app/target/*-SNAPSHOT.jar /app/app.jar
ENV SPRING_PROFILES_ACTIVE=qa
ENV LOG_PATH=/Logs
# Config por defecto (puedes cambiarlas al correr)
ENV SERVER_PORT=8080

ENV SERVER_ADDRESS=0.0.0.0
EXPOSE 8080
#ENV JAVA_TOOL_OPTIONS="-Dspring.profiles.active=docker"
ENTRYPOINT ["java","-jar","/app/app.jar"]