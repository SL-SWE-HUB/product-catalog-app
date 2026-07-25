# product-catalog-app

![Java](https://img.shields.io/badge/Java-21_LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.5-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![React](https://img.shields.io/badge/React-19.1.0-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![Vite](https://img.shields.io/badge/Vite-6.3.5-646CFF?style=for-the-badge&logo=vite&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-13+-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Node.js](https://img.shields.io/badge/Node.js-16+-339933?style=for-the-badge&logo=node.js&logoColor=white)

A robust full-stack application for managing and browsing a product catalog. It features a Spring Boot REST API backend with JPA/Hibernate ORM, a modern React 19 frontend powered by Vite, and PostgreSQL for persistent data storage. The entire application is containerized with Docker for seamless deployment.

## Overview

**product-catalog-app** serves as a complete solution for product management, featuring:
* **RESTful Architecture:** A clean API built with Spring Boot 3.4.5 and Spring Data JPA.
* **Modern UI:** A fast, responsive frontend built with React 19.1.0 and Vite 6.3.5.
* **Data Persistence:** Reliable storage using PostgreSQL with Hibernate ORM.
* **DevOps Ready:** Includes Docker multi-stage build configuration for containerized environments.
* **Testing:** Comprehensive test coverage using JUnit 5 and H2 in-memory database.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Installation Guide](#installation-guide)
  - [Prerequisites](#prerequisites)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)

---

## Features

### Backend (API)
* **Product Management:** Full CRUD RESTful endpoints for product operations.
* **ORM Integration:** JPA/Hibernate for seamless database operations with Spring Data.
* **Testing:** Comprehensive test coverage using JUnit 5 and H2 in-memory database.
* **Build Tool:** Maven with Maven Wrapper for consistent builds across environments.
* **Spring Boot Starters:** 
  - `spring-boot-starter-data-jpa` for database access
  - `spring-boot-starter-web` for REST API functionality

### Frontend (Client)
* **Performance:** Built with Vite 6.3.5 for lightning-fast HMR (Hot Module Replacement) and production builds.
* **Modern React:** Utilizes React 19.1.0 with React DOM and functional components.
* **Code Quality:** ESLint configuration ensures code quality and consistency.
* **Build & Dev Tools:**
  - `@vitejs/plugin-react` for React Fast Refresh with Babel
  - ESLint 9.25.0 with React hooks and refresh plugins

---

## Tech Stack

| Component | Technology | Version |
| :--- | :--- | :--- |
| **Backend Framework** | Spring Boot | 3.4.5 |
| **Language** | Java | 21 (LTS) |
| **Build Tool (Backend)** | Maven | 3 (via Maven Wrapper) |
| **Database** | PostgreSQL | 13+ |
| **ORM** | Hibernate / Spring Data JPA | (included in Spring Boot) |
| **Frontend Library** | React | 19.1.0 |
| **React DOM** | React DOM | 19.1.0 |
| **Frontend Build Tool** | Vite | 6.3.5 |
| **Vite Plugin** | @vitejs/plugin-react | 4.4.1 |
| **Linter (Frontend)** | ESLint | 9.25.0 |
| **Container Runtime** | Docker | Latest |
| **JDK Runtime (Build)** | Eclipse Temurin | 21-jdk |
| **JRE Runtime (Container)** | Eclipse Temurin | 21-jre |
| **Node.js Runtime** | Node.js | 16+ |
| **Node Package Manager** | npm | Latest |
| **Testing Framework** | JUnit 5 | (included in Spring Boot) |
| **Test Database** | H2 Database | (included in Spring Boot) |

---

## Installation

### Prerequisites

**System Requirements:**
- Java 21+ (for backend development)
- Node.js 16+ & npm (for frontend development)
- PostgreSQL 13+ (for production database)
- Docker (optional, for containerized deployment)
- Git

**Optional:**
- Maven 3+ (or use the included Maven Wrapper)

### Backend Setup

1. Navigate to the backend directory:
```bash
cd product-catalog-backend
```

2. Configure the database: Create a database in PostgreSQL named `product_catalog_db`
```sql
CREATE DATABASE product_catalog_db;
```

3. Update Configuration: Open `src/main/resources/application.properties` and configure your credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product_catalog_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=org.postgresql.Driver

# Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=false
```

4. Build and Run the application using Maven Wrapper:
```bash
# Linux/macOS - Build the project
./mvnw clean install

# Linux/macOS - Run the application
./mvnw spring-boot:run

# Windows - Build the project
mvnw.cmd clean install

# Windows - Run the application
mvnw.cmd spring-boot:run
```

The backend API will be available at `http://localhost:8080`

### Frontend Setup

1. Navigate to the frontend directory:
```bash
cd product-catalog-frontend
```

2. Install Dependencies:
```bash
npm install
```

3. Environment Setup: Create a `.env.local` file in the frontend root directory to define the API URL:
```env
VITE_API_URL=http://localhost:8080/api
```

4. Start Development Server:
```bash
npm run dev
```

The frontend UI will be available at `http://localhost:5173`

---

## Running the Application

### Local Development (Recommended)

**Terminal 1 - Backend:**
```bash
cd product-catalog-backend
./mvnw spring-boot:run
```

**Terminal 2 - Frontend:**
```bash
cd product-catalog-frontend
npm run dev
```

### Using Docker

**Build the backend Docker image:**
```bash
cd product-catalog-backend
docker build -t product-catalog-backend:latest .
```

**Run the backend container:**
```bash
docker run -d \
  --name product-catalog-backend \
  -p 8080:8080 \
  -e DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/product_catalog_db \
  product-catalog-backend:latest
```

---

## API Documentation

For detailed API endpoints and component documentation, see [API_ENDPOINTS_AND_COMPONENTS.md](API_ENDPOINTS_AND_COMPONENTS.md)

### Core Endpoints

- **GET** `/api/products/` - Fetch all products
- **GET** `/api/products/{id}` - Fetch a specific product
- **POST** `/api/products/create` - Create a new product
- **PUT** `/api/products/{id}` - Update an existing product
- **DELETE** `/api/products/{id}` - Delete a product

---

## Project Structure

```
product-catalog-app/
├── product-catalog-backend/          # Spring Boot REST API
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/example/product_catalog_backend/
│   │   │   │       ├── controller/
│   │   │   │       ├── service/
│   │   │   │       ├── entity/
│   │   │   │       └── repository/
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── Dockerfile                    # Multi-stage Docker build
│   ├── pom.xml                       # Maven configuration
│   └── mvnw/mvnw.cmd                 # Maven Wrapper scripts
├── product-catalog-frontend/         # React + Vite application
│   ├── src/
│   │   ├── components/
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── public/
│   ├── package.json
│   ├── vite.config.js
│   └── eslint.config.js
├── README.md                         # This file
└── API_ENDPOINTS_AND_COMPONENTS.md   # API documentation
```

---

## Development Workflow

### Backend Development
- Code changes in `product-catalog-backend/src/` are automatically detected by Spring Boot DevTools
- Run tests: `./mvnw test`
- Build JAR: `./mvnw package`

### Frontend Development
- Vite's HMR provides instant updates when files change
- Lint code: `npm run lint`
- Build for production: `npm run build`
- Preview production build: `npm run preview`

---

## Contributing

1. Create a feature branch from `main`
2. Make your changes
3. Run tests and linting
4. Commit your changes
5. Submit a pull request

---

## License

This project is open source and available under the MIT License.

---

## Support

For issues, questions, or contributions, please refer to the project's GitHub repository.
