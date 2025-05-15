# Java and Spring Boot Study Plan (9 Months)

**Focus Areas**: Core Java, OOP, Spring Boot, Databases, REST APIs, Security, Docker, and CI/CD  
**Total Duration**: 9 months (~10-15 hours/week)  
- **Phase 1**: Months 1-3 (Core Java, OOP, Git, Design Patterns)  
- **Phase 2**: Months 4-6 (Spring Boot, Testing, Security)  
- **Phase 3**: Months 7-8 (Databases, Data Structures)  
- **Phase 4**: Month 9 (Advanced APIs, Docker, CI/CD)

---

## ✅ **Phase 1: Java Core + OOP + Design Patterns** (3 Months)

**Objectives**:  
- Master Java fundamentals and OOP principles.  
- Learn version control with Git.  
- Understand key Design Patterns using *Design Patterns in Java*.  
- Build a small project with input validation for security awareness.  

**Study Materials**:  
📘 *Introduction to Java Programming – Y. Daniel Liang*  
📘 *Design Patterns in Java – Steven John Metsker & William Wake*  
📘 *Git Documentation* (online, free)

| Week | Topic | Source | Duration | Notes |
|------|-------|--------|----------|-------|
| 1    | Intro to Java, Git Basics | Liang Ch1, Git Docs | 1 week | Create GitHub repo, learn commits/branches |
| 2    | Variables, Operations, I/O | Liang Ch2 | 1 week | Practice basic I/O programs |
| 3    | Conditional Statements | Liang Ch3 | 1 week | Focus on if-else, switch |
| 4    | Loops | Liang Ch4 | 1 week | Practice for/while loops |
| 5    | Methods | Liang Ch5 | 1 week | Method creation, parameters |
| 6    | Arrays (1D) | Liang Ch6 | 1 week | Array manipulation |
| 7    | Arrays (2D) | Liang Ch7 | 1 week | Multi-dimensional arrays |
| 8    | Objects & Classes | Liang Ch8 | 1 week | Intro to OOP |
| 9    | Custom Classes | Liang Ch9 | 1 week | Class design |
| 10   | Inheritance | Liang Ch10 | 1 week | Extend classes |
| 11   | Polymorphism, Interfaces | Liang Ch11, Ch13 | 1 week | Flexible scheduling if needed |
| 12   | Exception Handling, Design Patterns Intro, Strategy Pattern | Liang Ch12, Design Patterns in Java Ch5, Ch9 | 1 week | Input validation, Strategy Pattern application |

**Design Patterns Covered (from *Design Patterns in Java*)**:  
- **Week 12**:  
  - Ch5: *An Introduction to Design Patterns* (overview, importance, and context).  
  - Ch9: *The Strategy Pattern* (handling varying algorithms, applied to a simple use case).  

**Practical Activities**:  
- **Coding Exercises**: Solve 10 LeetCode Easy problems (arrays, loops).  
- **Git Lab**: Set up a GitHub repo, practice commits, and create a branch (Week 1).  
- **Mini-Project (Week 12)**: Build a Library Management System (Java console app) with:  
  - OOP (inheritance, polymorphism).  
  - Basic input validation (e.g., check for null/empty inputs).  
  - Implementation of the Strategy Pattern (e.g., different sorting strategies for books).  
  - Version control using Git.  
  - **Tools**: IntelliJ IDEA, Git.  
  - **Output**: GitHub repo with documented code.

---

## ✅ **Phase 2: Spring Core + Spring Boot + Testing + Security** (2.5 Months)

**Objectives**:  
- Learn Spring Framework and Spring Boot for web development.  
- Implement unit testing with JUnit and Mockito.  
- Introduce Spring Security for authentication/authorization.  
- Build a secure REST API project.  

**Study Materials**:  
📘 *Pro Spring 5*  
📘 *Spring Boot in Action*  
📘 *Spring Boot Up & Running*  
📘 *Spring Security Documentation* (online, free)  

| Week | Topic | Source | Duration | Notes |
|------|-------|--------|----------|-------|
| 13   | Intro to Spring, Maven/Gradle | Pro Spring Ch1, Online Tutorials | 0.5 week | Learn build tool basics |
| 13-14| IoC & Dependency Injection | Pro Spring Ch3 | 1 week | Bean lifecycle |
| 14-15| Spring Core Configuration | Pro Spring Ch2 | 1 week | Annotations vs XML |
| 15-16| Advanced IoC | Pro Spring Ch5 | 1 week | Scopes, profiles |
| 16-17| AOP | Pro Spring Ch8 | 1 week | Cross-cutting concerns |
| 17-18| Spring Boot Intro | Spring Boot in Action Ch1, Up & Running Ch1 | 1 week | Setup first app |
| 18-19| REST APIs | Spring Boot in Action Ch2, Up & Running Ch2 | 1 week | CRUD endpoints |
| 20   | Spring Security Basics | Spring Security Docs | 1 week | Authentication/Authorization |
| 21   | Testing (JUnit, Mockito) | Spring Boot in Action Ch3-4, Online Tutorials | 1 week | Unit & mock testing |

**Practical Activities**:  
- **Coding Exercises**: Build 3-5 REST APIs (e.g., user management CRUD) with Spring Boot.  
- **Testing**: Write JUnit tests (Week 21) and Mockito mocks for service layer.  
- **Project (Week 21)**: Enhance Task Management System with:  
  - REST APIs for task CRUD.  
  - User authentication (Spring Security with basic auth).  
  - JUnit and Mockito tests.  
  - **Tools**: Postman, Maven/Gradle, Git.  
  - **Output**: GitHub repo with secure app and tests.

---

## ✅ **Phase 3: Databases + Data Structures** (2 Months)

**Objectives**:  
- Master database design, SQL, and Spring Data JPA.  
- Learn Java Collections and core data structures.  
- Integrate a database with a Spring Boot app.  

**Study Materials**:  
📘 *Database System Concepts*  
📘 *Java Programming – Y. Daniel Liang*  
📘 *Spring Data JPA Documentation* (online, free)  

| Week | Topic | Source | Duration | Notes |
|------|-------|--------|----------|-------|
| 22   | Java Collections (Lists, Maps) | Liang Ch21 | 1 week | ArrayList, HashMap |
| 23   | Database Design, SQL Basics | Database Concepts Ch1-4 | 1 week | ER diagrams, normalization |
| 24   | Advanced SQL | Database Concepts Ch5-7 | 1 week | Joins, subqueries |
| 25   | Lists, Stacks, Queues | Liang Ch20 | 1 week | LinkedList, Stack |
| 26   | Sorting & Searching | Liang Ch23 | 1 week | QuickSort, Binary Search |
| 27-28| Trees (Binary, AVL) | Liang Ch25-26 | 1 week | Tree traversal |

**Practical Activities**:  
- **Coding Exercises**: Solve 15 LeetCode Medium problems (trees, graphs).  
- **SQL Exercises**: Complete 15-20 SQL problems on LeetCode SQL or HackerRank.  
- **Project (Week 28)**: Extend the Task Management System (Phase 2) with:  
  - MySQL database integration using Spring Data JPA/Hibernate.  
  - Queries for task filtering (e.g., by status).  
  - **Tools**: MySQL Workbench, Spring Boot, Git.  
  - **Output**: GitHub repo with database-integrated app.

---

## ✅ **Phase 4: Advanced REST APIs + Docker + Security + CI/CD** (1.5 Months)

**Objectives**:  
- Design advanced REST APIs with HATEOAS and Swagger documentation.  
- Secure APIs with OAuth2/JWT.  
- Deploy apps with Docker and automate with GitHub Actions.  
- Build a production-ready final project.  

**Study Materials**:  
📘 *RESTful Web API Patterns & Practices*  
📘 *Docker Documentation* (online, free)  
📘 *Spring Security OAuth2/JWT Tutorials* (online, free)  
📘 *Swagger/OpenAPI Documentation* (online, free)  

| Week | Topic | Source | Duration | Notes |
|------|-------|--------|----------|-------|
| 29   | REST Principles, Swagger | RESTful APIs Part I, Swagger Docs | 1 week | API documentation |
| 30   | HATEOAS | RESTful APIs Part II | 1 week | Hypermedia links |
| 31   | Docker, Docker Compose | Docker Docs | 0.5 week | Containerize app |
| 31-32| OAuth2/JWT Security | Spring Security Tutorials | 0.5 week | Secure APIs |
| 32-33| CI/CD with GitHub Actions | Online Tutorials | 1 week | Automate testing/deployment |

**Practical Activities**:  
- **Coding Exercises**: Build 2-3 REST APIs with HATEOAS and Swagger documentation.  
- **Docker Exercises**: Containerize a Spring Boot app with Docker Compose (MySQL + app).  
- **Final Project (Weeks 32-33)**: Build a Booking System with:  
  - REST APIs (HATEOAS, Swagger-documented).  
  - Role-based access control (Spring Security with OAuth2/JWT).  
  - MySQL database (via Spring Data JPA).  
  - JUnit/Mockito tests.  
  - Docker Compose setup (app + database).  
  - GitHub Actions for automated testing/deployment.  
  - **Tools**: Docker, Postman, Git, GitHub Actions.  
  - **Output**: GitHub repo with app, Dockerfile, Docker Compose, CI/CD pipeline, and README.

---

## **Additional Recommendations**

1. **Supplementary Resources**:  
   - **Udemy**: *Spring Boot Master Class* for visual learning.  
   - **YouTube**: *AmigosCode* for Spring Security and Docker tutorials.  
   - **freeCodeCamp**: SQL and Java tutorials for reinforcement.  

2. **LeetCode Strategy**:  
   - Phase 1: 10 Easy problems (arrays, loops).  
   - Phase 3: 15 Medium problems (trees, graphs).  

3. **Optional Frontend**:  
   - Bonus week in Phase 4 for Thymeleaf or React basics (full-stack exposure).  

4. **Community Engagement**:  
   - Join Java/Spring Boot Discord or Reddit groups for peer support.  
   - Participate in Stack Overflow for problem-solving.  

---

## **Tools Stack**
- **Development**: IntelliJ IDEA, Postman, MySQL Workbench.  
- **DevOps**: Docker, Docker Compose, GitHub Actions.  
- **Testing**: JUnit 5, Mockito, Postman.  
- **Documentation**: Swagger/OpenAPI, GitHub README.

---

## **Timeline Summary**
| Phase | Duration | Key Additions |  
|-------|----------|---------------|  
| 1 | Months 1-3 | Git basics, input validation, Strategy Pattern |  
| 2 | Months 4-6 | Spring Security, Maven/Gradle, Mockito |  
| 3 | Months 7-8 | Java Collections, Spring Data JPA |  
| 4 | Month 9 | Swagger, OAuth2/JWT, Docker Compose, CI/CD |

---
