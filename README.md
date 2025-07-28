🐔 Farisha Chicken Backend

Farisha Chicken is a secure and robust backend service for managing customer orders and user roles in a chicken store. The application is built with proper exception handling, security enforcement, and clearly defined role-based access controls.
🚀 Features

    🛡️ Security Integration
    Passwords are securely stored using BCrypt hashing. Role-based authorization ensures controlled access to various operations.

    ⚠️ Global Exception Handling
    Centralized error management using @ControllerAdvice and custom exceptions ensures consistent and user-friendly error responses across all endpoints.

    👥 Role-Based Access Control (RBAC)
    Users are categorized into three roles:

        Employee

        Manager

        Admin
        

👮 Security Credentials

| Username | Password (BCrypt Encrypted) | Roles                          |
| -------- | --------------------------- | ------------------------------ |
| nishadh  | `{bcrypt)Riza`              | `employee`                     |
| nazrin   | `{bcrypt)Fiza`              | `employee`, `manager`          |
| ahamed   | `{bcrypt)Farisha`           | `employee`, `manager`, `admin` |

🔐 Role-Based Permissions

| Role     | View User | Add User | Update User | Delete User |
| -------- | --------- | -------- | ----------- | ----------- |
| Employee | ✅         | ❌        | ❌           | ❌           |
| Manager  | ✅         | ✅        | ✅           | ❌           |
| Admin    | ✅         | ✅        | ✅           | ✅           |

📦 REST API Endpoints

🐓 Chicken APIs

| Method | Endpoint             | Description                     | Access Roles             |
| ------ | -------------------- | ------------------------------- | ------------------------ |
| GET    | `/chicken/item`      | Get all chicken items           | Employee, Manager, Admin |
| GET    | `/chicken/item/{id}` | Get a specific chicken item     | Employee, Manager, Admin |
| POST   | `/chicken/item`      | Add a new chicken item          | Manager, Admin           |
| PUT    | `/chicken/item/{id}` | Update an existing chicken item | Manager, Admin           |
| DELETE | `/chicken/item/{id}` | Delete a chicken item           | Admin only               |

    🔒 All endpoints are secured. You must provide valid credentials with the correct role to access them.

❗ Exception Handling

The application includes a global exception handler using @ControllerAdvice, which catches and processes various types of exceptions such as:

    Not_FoundException

    Bad_RequestException

This ensures:

    Cleaner controller code

    Consistent API error structure

    Improved debugging and logging

Sample error response:

{
 {
    "status": 404,
    "message": "User not found : 2",
    "timestamp": 1753704808316
}
}

📁 Project Structure 

farisha-chicken/
├── src/
│   ├── controller/
|   ├── dao/
|   ├── entity/
│   ├── exception/       # Contains global exception handlers and custom exceptions
│   ├── security/
│   ├── service/
├── application.properties
└── README.md

🧪 Testing Credentials

Test the API using tools like Postman:

    Use Basic Auth with the credentials provided above.

    Verify that role-based access and exception handling behave as expected.

