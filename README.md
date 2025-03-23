#  Spring Boot + React Full-Stack Library Application

This is a full-stack library management system built with **Spring Boot**, **MySQL**, and **React**.  
It allows users to view, add, and manage books in a library with a modern web interface.

---

##  Tech Stack

-  **Backend**: Java 17 + Spring Boot
-  **Frontend**: React.js (with functional components & hooks)
-  **Database**: MySQL 8
-  **DevOps**: Docker + Docker Compose

---

##  How to Run

> Make sure you have Docker installed.

### Start with Docker Compose

bash
docker-compose up --build

This will start:

MySQL container on port 3306

Spring Boot backend on port 8080

React frontend on port 3000


project_lib/
├── backend/         --> Spring Boot code
├── frontend/        --> React app (library_ui)
├── compose.yaml     --> Docker Compose configuration
└── README.md

Features
Add book with title, author, and year

View book list instantly from React UI

Fully containerized with Docker

Clean service-based backend structure (Controller - Service - Repository)


Environment variables for database credentials are injected via Docker Compose
and read in application.properties using placeholders like:


spring.datasource.url=${SPRING_DATASOURCE_URL}

You can manage these using .env file (optional) and gitignore protects them from leaking.

Author
GitHub: Hymman
Built as part of a full-stack learning journey combining Java, React, Docker, and GitHub.

This is just the beginning — security, pagination, search, and update/delete features can be added later.

Contributions and suggestions are welcome 