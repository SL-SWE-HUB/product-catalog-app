# product-catalog-app

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.5-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![React](https://img.shields.io/badge/React-19-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-13+-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED?style=for-the-badge&logo=docker&logoColor=white)

A robust full-stack application for managing and browsing a product catalog. It uses a Spring Boot REST API backend and a React (Vite) frontend interface, fully containerized for easy deployment.

## Overview

**product-catalog-app** serves as a complete solution for product management, featuring:
* **RESTful Architecture:** A clean API built with Spring Boot and JPA.
* **Modern UI:** A fast, responsive frontend built with React 19 and Vite.
* **Data Persistence:** Reliable storage using PostgreSQL.
* **DevOps Ready:** Includes Docker configuration for containerized environments.

## Table of Contents

- [Features]
- [Tech Stack]
- [Architecture]
- [Project Structure]
- [Installation Guide]
  - [Prerequisites]
  - [Backend Setup]
  - [Frontend Setup]


---

## Features

### Backend (API)
* **Product Management:** Full CRUD RESTful endpoints.
* **ORM Integration:** JPA/Hibernate for seamless database operations.
* **Testing:** Comprehensive test coverage using H2 in-memory database.
* **Optimization:** Spring Data JPA for simplified data access layers.

### Frontend (Client)
* **Performance:** Built with Vite for fast HMR (Hot Module Replacement) and builds.
* **Modern React:** Utilizes React 19 features with functional components.
* **Routing:** Integrated React Router for seamless navigation.
* **Quality Control:** ESLint configuration ensures code quality and consistency.

---

## Tech Stack

| Component | Technology | Version |
| :--- | :--- | :--- |
| **Backend Framework** | Spring Boot | 3.4.5 |
| **Language** | Java | 21 (LTS) |
| **Database** | PostgreSQL | 13+ |
| **Frontend Lib** | React | 19.1.0 |
| **Build Tool** | Vite | 6.3.5 |
| **Runtime** | Docker / Node.js | Temurin 21 / Node 16+ |

---

## Installation
### Prerequesites
- Java 21+
- Node.js 16+ & npm
- PostgreSQL 13+
- Git

### Backend Setup
1. Navigate to the backend directory:
```cd backend```
2. Configure the database: Create a database in PostgreSQL named product_catalog_db.
```CREATE DATABASE product_catalog_db;```
3. Update Configuration: Open src/main/resources/application.properties and configure your credentials:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/product_catalog_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=org.postgresql.Driver

# Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```
4. Build and Run:
```
# Linux/macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

### Frontend Setup
1. Navigate to the frontend directory:
```cd frontend```
2. Install Dependencies:
```npm install```
3. Environment Setup: Create a .env.local file in the frontend root to define the API URL:
```VITE_API_URL=http://localhost:8080/api```
4. Start Development Server:
```npm run dev```
The UI will generally be available at http://localhost:5173
