📘 Student Management System

A full-stack web application built with Spring Boot, Spring Security, Hibernate/JPA, MySQL, and Thymeleaf to manage students, teachers, courses, and assignments efficiently.

🚀 Features

👨‍💼 Admin

Add, update, and delete Students, Teachers, and Courses

Enroll students into courses

View school statistics and reports

👩‍🏫 Teacher

Manage assignments for courses

View enrolled students

Grade student exams and assignments

🎓 Student

View enrolled courses and assignments

Submit and mark assignments as completed

Check grades and progress

🏗️ System Architecture

Architecture: MVC (Model–View–Controller) + Layered Design

Controller Layer: Handles HTTP requests and routing

Service Layer: Core business logic

DAO/Repository Layer: Database operations via JPA/Hibernate

View Layer: Thymeleaf templates for dynamic UI

🧩 Technology Stack
Layer	Technology
Backend	Java, Spring Boot, Spring MVC, Spring Security
Frontend	Thymeleaf, HTML5, CSS3
Database	MySQL
ORM	Hibernate / JPA
Build Tool	Maven
Server	Embedded Tomcat
⚙️ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/yourusername/student-management-system.git
cd student-management-system

2️⃣ Configure Database

Open src/main/resources/application.properties and set your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Application
mvn spring-boot:run


Then open your browser at:
👉 http://localhost:8080

🔐 Demo Accounts
Role	Username	Password
Admin	admin	123
Teacher	teacher1	123
Student	student1	123
🧪 Testing

Unit Tests: Verify service and repository logic

Integration Tests: Validate complete workflow (View → Controller → Service → Database)

Security Tests: Ensure role-based access control via Spring Security

🛠️ Future Enhancements

Add email notification system for assignment updates

Mobile-friendly responsive dashboard

Payment & fee management module

📜 License

This project is open-source under the MIT License
.
