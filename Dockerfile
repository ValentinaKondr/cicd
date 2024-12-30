FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /calculator

# Copy the application JAR file to the container
COPY target/calculator-1.0-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]