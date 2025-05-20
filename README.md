# Spring Boot Security Application

This is a Spring Boot application that demonstrates user authentication and authorization using Spring Security with plain text passwords for educational purposes.

## Prerequisites

- Java JDK 17 or higher
- Maven 3.6.0 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Setup and Run

Follow these steps to set up and run the application:

### 1. Clone or Download the Project

Clone this repository or download and extract the zip file to your local machine.

### 2. Build the Project

Navigate to the project directory:

```bash
cd Lab08
```

Build the project using Maven:

```bash
mvn clean install
```

### 3. Run the Application

Start the application:

```bash
mvn spring-boot:run
```

Alternatively, you can run the application from your IDE by running the `Lab08Application` class.

### 4. Access the Application

Once the application is running, open a web browser and navigate to:

```
http://localhost:8080/login
```

### 5. Test Credentials

The application comes with pre-configured users for testing:

| Email | Password | Role |
|-------|----------|------|
| admin@gmail.com | admin | ADMIN |
| test@gmail.com | test | USER |
| abc@gmail.com | abc | USER |
| def@gmail.com | def | ADMIN, USER |

### 6. Accessing the H2 Console

The application uses an in-memory H2 database. To access the H2 console:

1. Make sure the application is running
2. Open a web browser and navigate to:
   ```
   http://localhost:8080/h2-console
   ```
3. Use the following connection details:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: (leave blank)
   - Click "Connect"

4. In the H2 console, you can:
   - View all database tables (USERS, ROLES, USERS_ROLES)
   - Execute SQL queries
   - See the plain text passwords stored in the USERS table

### 7. Application Features

- **Login**: Authenticate with existing credentials
- **Registration**: Create a new user account
- **User Page**: View user details (only accessible to authenticated users)
- **Logout**: End your session

## Security Note

This application uses `NoOpPasswordEncoder` which stores passwords in plain text. This is done for educational purposes only and should **never** be used in production environments. In real-world applications, always use proper password encryption like BCrypt.

## Project Structure

- `model`: Contains entity classes (User, Role)
- `repository`: JPA repositories for data access
- `service`: Service layer for business logic
- `controller`: Web controllers handling HTTP requests
- `config`: Configuration classes, including security setup
- `dto`: Data Transfer Objects
- `util`: Utility classes

## Database

The application uses an H2 in-memory database which is initialized with test data from `data.sql`. The database is recreated each time the application starts.
```

Made changes.
