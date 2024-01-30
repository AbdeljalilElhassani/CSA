FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/*.jar app.jar

# Expose the port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
