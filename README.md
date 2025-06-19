# Product Catalog App

### 📖 Overview

The "product-catalog-app" application features a backend service built with Java and Spring Boot, which manages product information stored in a PostgreSQL database and exposes the data through a REST API. On the frontend, a modern user interface built with React consumes this API to display the product catalog in a web browser.


#### Why This Project?

- Move beyond isolated code snippets to create a multi-component system that works end-to-end.
- Hands-on experience with Java, Spring Boot, React, PostgreSQL, Git, and Docker. 


### ✨ Key Features

- Backend: Spring Boot to perform CRUD (Create, Read, Update, Delete) operations on product data.

- Frontend: React to build a dynamic and responsive user interface that fetches and displays product information.

- Database: PostgreSQL for persistent data storage

- Containerization: Docker for containerization of the entire application stack (backend, frontend, database)

- Testing: Unit tests for the backend service


### 🛠️ Technology Stack

- The project's architecture is organized into distinct layers. 

##### Backend
- (https://spring.io/projects/spring-boot)
A leading framework for building robust, production-ready REST APIs in Java with minimal configuration and boilerplate code.


- (https://spring.io/projects/spring-data-jpa)
A Spring module that simplifies data access layers by providing a complete abstraction over JPA, including the database itself.


##### Frontend
- React: (https://react.dev/)
A popular and powerful JavaScript library for building modern, component-based, and interactive user interfaces.


- Javascript: (https://developer.mozilla.org/en-US/docs/Web/JavaScript)
The primary language for frontend logic and interactivity, utilizing modern syntax and features.


- HTML / CSS (https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5) /(https://developer.mozilla.org/en-US/docs/Web/CSS)
The fundamental languages for structuring and styling all web content.


##### Database
- PostgreSQL: (https://www.postgresql.org/)
A powerful, open-source object-relational database system known for its reliability, feature robustness, and performance.


##### Build & Tools
- Maven
A build automation and dependency management tool used for the Java backend, managing the project's lifecycle and dependencies.9


- Git
The industry-standard distributed version control system, essential for tracking code changes and collaboration.


##### Testing
- JUnit 5
The standard framework for writing and running unit tests for Java applications, crucial for ensuring code quality.


##### Deployment
- Docker: (https://www.docker.com/) &(https://docs.docker.com/compose/)
A platform for developing, shipping, and running applications in containers, ensuring environment consistency and simplifying deployment.11



### 🚀 Getting Started

##### Prerequisites

Eensure you have the following software installed on your system.
✅ Git: For cloning the repository. You can download it from git-scm.com.
✅ Java Development Kit (JDK): Version 21 (LTS) or later. Official builds are available from(https://www.oracle.com/java/technologies/downloads/#jdk21).7
✅ Node.js: Version 18 or later (which includes npm). Download from nodejs.org.15
✅ Docker & Docker Compose: For containerizing and running the application stack. The easiest way to get both is by installing(https://www.docker.com/products/docker-desktop/).11

##### Installation & Setup

The recommended approach uses Docker to simplify the setup, but a manual method is also provided for those who wish to run the services directly.
Clone the Repository
Open your terminal or command prompt and clone this repository to your local machine:
Bash
git clone https://github.com/your-username/simple-ecommerce-product-catalog.git


##### Navigate to the Project Directory
Bash
cd simple-ecommerce-product-catalog



##### Running the Application (Recommended: Docker)

This is the simplest and most reliable way to run the application.

Build and Run with Docker Compose
From the root of the project directory, run the following command:
Bash
docker-compose up --build

This command will:
1. Pull the official PostgreSQL image.
2. Build a Docker image for the Spring Boot backend.
3. Build a Docker image for the React frontend.
4. Access the Application
5. Once the containers are up and running, you can access the application:
Frontend UI: Open your web browser and navigate to http://localhost:3000
Backend API: The API is accessible at http://localhost:8080

### Running the Application (Alternative: Manual Setup)

For those who prefer to run each service manually without Docker, follow the steps below. This method provides a deeper understanding of how each component operates independently.

#### 1. Start the PostgreSQL Database: You will need a running instance of PostgreSQL. You can install it locally or run it via Docker with the following command:

- Bash
- docker run --name postgres-db -e POSTGRES_PASSWORD=password -e POSTGRES_DB=product_catalog -p 5432:5432 -d postgres

This command starts a PostgreSQL container, sets the password and database name, and exposes it on port 5432.


#### 2. Run the Backend (Spring Boot)

In a new terminal window, navigate to the backend directory and use Maven to run the application.
- Bash

Navigate to the backend directory
- cd backend

Run the Spring Boot application
- mvn spring-boot:run

The backend server will start and be available at http://localhost:8080. It will automatically connect to the PostgreSQL instance running on localhost:5432.

#### 3. Run the Frontend (React)

In another terminal window, navigate to the frontend directory, install the dependencies, and start the development server.

- Bash

Navigate to the frontend directory
- cd frontend

Install project dependencies
- npm install

Start the React development server
- npm start

The frontend application will start and automatically open in your default web browser at http://localhost:3000.



### 🧪 Testing

To run the unit tests, navigate to the backend directory and execute the following Maven command:

- Bash

Navigate to the backend directory
- cd backend

Run the JUnit tests
- mvn test

Maven will compile the test sources, run all tests, and provide a summary report in the terminal.



### API Endpoints

The backend exposes a simple REST API for managing products. This serves as the contract between the frontend and backend.

Method
Endpoint
Description
GET
/api/products
Retrieves a list of all available products.
GET
/api/products/{id}
Retrieves a single product by its unique ID.

