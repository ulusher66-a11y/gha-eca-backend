# gha-eca-backend

 GHA Extra-Curricular Activities Management System – Backend

## Overview  
This is the **backend API** for the **GHA Extra-Curricular Activities Management System (ECA-MS)**.  
It provides RESTful endpoints to manage learners, activities, enrollments, and schedules.  
The frontend React app communicates with this backend through secure HTTP APIs.

---

##  Tech Stack

| Category | Technology |
|-----------|-------------|
| Language | Java 17+ |
| Framework | Spring Boot (Web, JPA, Validation, Lombok) |
| Database | MySQL (Production) / H2 (Development) |
| Build Tool | Maven |
| API Type | RESTful API |

---

## Project Structure
src/
└─ main/
├─ java/rw/gha/
│ ├─ controller/ # REST controllers
│ ├─ repository/ # Spring Data JPA repositories
│ └─ entity/ # JPA entities
└─ resources/
└─ application.properties

## Database Configuration

Edit your file:  
`src/main/resources/application.properties`

```properties
# ==== DATABASE ====
spring.datasource.url=jdbc:mysql://localhost:3306/gha_eca_db
spring.datasource.username=root
spring.datasource.password=

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# ==== JPA/Hibernate ====
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# ==== Server (optional) ====
# server.port=8080
Note: Ensure MySQL is running and the database gha_eca_db exists.

 Run the Application
From the project root, open your terminal and run:

copy code
mvn spring-boot:run
The API will start at:
 http://localhost:8080

  Example Endpoints
Method	Endpoint	Description
GET	/api/activities	Get all activities
POST	/api/registrations	Register a student
GET	/api/registrations?studentEmail={email}	View registrations by student
DELETE	/api/registrations/{id}	Cancel a registration

Frontend Connection
The frontend (React.js) application that consumes this API:
GHA ECA Frontend

Build & Package
To build the project and create the JAR file:

copy code
mvn clean package
The packaged artifact will appear in:

copy code
target/gha-eca-backend-*.jar
To run it manually:

copy code
java -jar target/gha-eca-backend-*.jar

 Future Enhancements
Authentication & Authorization (JWT)
Role-based dashboards (Admin / Coach / Student)
Attendance tracking & reporting
Email notifications

 Author
Uzayisenga Chantal
Rwanda
Extracurricular Activities Coordinator at GHA
MIT Student – UNILAK
Languages: English/ French/ 中文 (Chinese)/Kinyarwanda

Acknowledgments
Special thanks to Lecturer Ignace Hakizimana for teaching us Advanced Programming Concepts and Emerging Technology.
