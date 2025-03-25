Library Management System – Full Stack Project

A full-stack Library Management application built using Spring Boot (Java), React.js, and MySQL.

This project allows users to perform CRUD operations on a list of books, with both a frontend interface and a RESTful backend service.

Tech Stack
----------
- Backend: Java, Spring Boot, Spring Data JPA, REST API
- Frontend: React.js, Axios, Bootstrap
- Database: MySQL
- Build Tools: Maven
- Dev Tools: IntelliJ, VS Code

Features
--------
- Add, edit, and delete books
- View book list dynamically
- Connected frontend & backend via RESTful APIs
- Structured and scalable project architecture

Installation & Run
------------------

Backend:
cd backend
mvn spring-boot:run

Frontend:
cd frontend
npm install
npm start

Project Structure
-----------------
springboot-react-library/
├── backend/         # Spring Boot REST API
├── frontend/        # React frontend
└── README.md

Future Improvements
-------------------
- JWT-based authentication
- Dockerization
- Deployment on AWS (EC2 / Elastic Beanstalk)
- CI/CD pipeline (GitHub Actions)

Author
------
Developed by @Hymman
Feel free to contribute or share feedback.


Environment variables for database credentials are injected via Docker Compose
and read in application.properties using placeholders like:


spring.datasource.url=${SPRING_DATASOURCE_URL}

You can manage these using .env file (optional) and gitignore protects them from leaking.

