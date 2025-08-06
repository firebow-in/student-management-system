# 🧑‍🎓 Student Management System - Spring Boot CRUD Web App

A full-stack Java web application for managing student records using **Spring Boot**, **Spring Data JPA**, and **MySQL**. This system enables you to **Create**, **Read**, **Update**, and **Delete** student data seamlessly.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Data JPA (Hibernate)
- MySQL 8+
- Maven
- JSP & JSTL
- Apache Tomcat (Embedded)

---

## 🎯 Key Features

- Add new student details
- Update student information
- Delete student records
- View list of all students
- Simple and clean UI using JSP

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.sms
│   │       ├── controller
│   │       ├── entity
│   │       ├── repository
│   │       └── StudentManagementSystemApplication.java
│   └── resources
│       ├── static
│       ├── templates (if needed)
│       ├── application.properties
│       └── META-INF
├── test
└── pom.xml
```

---

## ⚙️ Configuration

1. **MySQL Database Setup**
   - Create a database named: `student_db`
   - Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

2. **Maven Dependencies**  
   - All dependencies are included in `pom.xml`

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
    </dependency>
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
    </dependency>
</dependencies>
```

---

## 🛠️ How to Run

1. Clone or download the project:
```bash
git clone https://github.com/your-username/student-management-system.git
```

2. Open the project in **Eclipse** or **IntelliJ IDEA**.

3. Ensure MySQL is running and database is created.

4. Update `application.properties` with your DB credentials.

5. Run the application:
```bash
mvn spring-boot:run
```

6. Open browser and go to:
```
http://localhost:8080/students
```

---

## 📬 Postman - CRUD API Test

### ▶️ Create Student - POST
```
POST http://localhost:8080/students
Content-Type: application/json
```

#### JSON Body:
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```

---

### 📖 Read All Students - GET
```
GET http://localhost:8080/students
```

---

### ✏️ Update Student - PUT
```
PUT http://localhost:8080/students/{id}
Content-Type: application/json
```

#### JSON Body:
```json
{
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@example.com"
}
```

---

### ❌ Delete Student - DELETE
```
DELETE http://localhost:8080/students/{id}
```

---

## 🤝 Contribution

If you'd like to contribute:

1. Fork the repository  
2. Create a new branch: `git checkout -b feature-name`  
3. Commit your changes: `git commit -m 'Add some feature'`  
4. Push to the branch: `git push origin feature-name`  
5. Submit a pull request

---

## 👨‍💻 Author

**Tejas P**  
📍 Bangalore, Karnataka  
📧 Email: tejasp2103@gmail.com  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/your-profile)

---

## 📄 License

This project is for educational purposes only and not licensed for commercial use.

