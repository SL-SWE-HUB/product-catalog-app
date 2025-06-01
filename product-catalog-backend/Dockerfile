# Stage 1: Build the application using Maven and JDK
FROM eclipse-temurin:21-jdk-jammy AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper files
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./

# Download project dependencies using Maven wrapper
RUN --mount=type=cache,target=/root/.m2 ./mvnw dependency:go-offline

# Copy the project source code into the container
COPY src/ ./src/

# Packaging the application using Maven wrapper, skipping tests
# Create the executable JAR file in the 'target' directory
RUN ./mvnw package -DskipTests

# Stage 2: Create the final, smaller runtime image using JRE
FROM eclipse-temurin:21-jre-jammy

# Set the working directory for the runtime stage
WORKDIR /app

ENV DATASOURCE_URL="jdbc:postgresql://host.docker.internal:5432/product_catalog_db"

# Copying *only* the packaged JAR file from the 'build' stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the application runs on (default for Spring Boot = 8080)
EXPOSE 8080

# Command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]