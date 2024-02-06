FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the JAR file
COPY build/libs/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
