# E-Learn Web Platform

## Overview

E-Learn is a Java-based e-learning web application designed to facilitate online course browsing, student registration, authentication, and personalized profile viewing. The platform leverages Java Servlets for backend processing, JDBC for database connectivity, and modern frontend technologies for a responsive user experience.

This project is developed using the Eclipse IDE and runs on the Apache Tomcat server. It uses MySQL as the relational database for storing user information and course details.

---

## Key Features

- ✅ **User Registration and Login**  
  Secure student signup and login functionality using form-based authentication and session handling.

- ✅ **Course Listing Interface**  
  A visually structured display of multiple technology courses with images, pricing, and search functionality.

- ✅ **Dark Mode Support**  
  Toggle between light and dark themes to enhance accessibility and user comfort.

- ✅ **User Profile Page**  
  Authenticated users can view their stored information fetched securely using session data.

- ✅ **Search Filter**  
  Dynamic client-side search to filter courses based on user input.

---

## Technologies Used

### Frontend
- HTML5
- CSS3
- JavaScript (Vanilla)
- Font Awesome (for icons)

### Backend
- Java Servlets (Jakarta EE)
- JDBC (Java Database Connectivity)
- Apache Tomcat (Servlet container)

### Database
- MySQL 8.x

### Tools
- Eclipse IDE
- Git (for version control)

---

## Folder Structure
Elearn-Platform/
│
├── src/ # Java source code
│ └── PROJECT/ # Your Java package
│ ├── Login.java # Handles login authentication
│ ├── Signup.java # Handles user registration
│
├── WebContent/ or webapp/ # Frontend public files
│ ├── CSS/ # Stylesheets
│ │ └── style.css
│ ├── images/ # Course and logo images
│ │ ├── java.png
│ │ └── python.jpg
│ ├── login.html # Login page UI
│ ├── signup.html # Registration page
│
├── .classpath # Eclipse classpath file
├── .project # Eclipse project file
├── .gitignore # Git ignore rules (optional)
├── README.md # Project documentation
└── database.sql # SQL script to create and populate database
