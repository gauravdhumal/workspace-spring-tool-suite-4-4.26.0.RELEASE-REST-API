REST API CRUD Operation

A simple and scalable REST API CRUD Operation project built using Java, Spring Boot, Hibernate/JPA, PostgreSQL, and Maven.

This project demonstrates basic Create, Read, Update, and Delete (CRUD) operations using RESTful web services.

🚀 Features
Add New Record
Get All Records
Get Record By ID
Update Existing Record
Delete Record
RESTful APIs
Exception Handling
Layered Architecture
PostgreSQL Database Integration
Maven Project Structure
🛠️ Technologies Used
Java
Spring Boot
Spring Data JPA
Hibernate
PostgreSQL
Maven
REST APIs
📁 Project Structure
src/main/java
│
├── controller
│   └── EmployeeController.java
│
├── service
│   └── EmployeeService.java
│
├── repository
│   └── EmployeeRepository.java
│
├── entity
│   └── Employee.java
│
├── exception
│   └── GlobalExceptionHandler.java
│
└── RestApiCrudOperationApplication.java
⚙️ Setup Instructions
1️⃣ Clone Repository
git clone https://github.com/your-username/rest-api-crud-operation.git
2️⃣ Open Project

Import the project into:

Eclipse
IntelliJ IDEA
VS Code
3️⃣ Configure Database

Update application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/crud_db
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4️⃣ Run Application
mvn spring-boot:run

Application starts on:

http://localhost:8080
📌 API Endpoints
➕ Create Employee
POST /employees
Request Body
{
  "name": "Gaurav",
  "email": "gaurav@gmail.com",
  "department": "IT"
}
📖 Get All Employees
GET /employees
🔍 Get Employee By ID
GET /employees/{id}
✏️ Update Employee
PUT /employees/{id}
❌ Delete Employee
DELETE /employees/{id}
🧪 Testing APIs

You can test APIs using:

Postman
Thunder Client
Swagger UI
📌 Future Improvements
JWT Authentication
Pagination & Sorting
Swagger Documentation
Docker Integration
Unit Testing
Role-Based Authorization
👨‍💻 Author

Gaurav Dhumal

Java Full Stack Developer

⭐ Support

If you found this project useful, give it a ⭐ on GitHub.
