# Task Manager – Spring Boot REST API

A simple yet powerful **Task Manager backend application** built using **Spring Boot** that allows users to create, update, track, and manage tasks efficiently.  
This project demonstrates **real-world backend development practices** including REST APIs, JPA, and clean architecture.

---
## Features

- Create, update, delete tasks (CRUD)
- Task status management (TODO, IN_PROGRESS, DONE)
- Due date support for tasks
- Filter tasks by status
- Sort tasks by due date
- Persistent storage using relational database
- RESTful API design

---

## Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL / H2 (configurable)**
- **Maven**
- **Postman** (API testing)

---

## Project Structure

```text
Task-Manager
│── src/main/java
│   └── com.task.taskmanager
│       ├── controller
│       ├── service
│       ├── repository
│       └──  TaskManagerApplication.java
│       
│
│── src/main/resources
│   ├── application.properties
│
│── pom.xml
│── README.md



