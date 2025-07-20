# 🧑‍💼 Employee Management System (Java Swing + JDBC + MySQL)

A simple yet functional desktop-based Employee Management System built using **Core Java**, **Java Swing** for the GUI, **JDBC** for database connectivity, and **MySQL** for persistent data storage.

This application supports full CRUD (Create, Read, Update, Delete) operations for managing employee records in an organization.

---

## 🚀 Features

- 👤 Add New Employees
- 🛠️ Update Employee Details
- ❌ Delete Employees
- 🔍 View All Employees
- 🖥️ Desktop UI built with Java Swing
- 🗄️ Database Integration using JDBC and MySQL

---

## 🧱 Project Structure

```plaintext
/EmployeeManagement/
├── src/
│   └── com/
│       └── mayank/
│           ├── Main.java
│           ├── Employee.java
│           ├── EmployeeDAO.java
│           └── EmployeeForm.java
├── db/
│   └── employee_db.sql   # SQL script to create and initialize the employee table
├── README.md
└── .gitignore

⚙️ Tech Stack

| Technology | Description                   |
| ---------- | ----------------------------- |
| Java       | Core Logic                    |
| Swing      | GUI / Frontend                |
| JDBC       | Database connectivity         |
| MySQL      | Relational Database           |
| NetBeans   | Development Environment (IDE) |

🛠️ Setup Instructions
1. 🧬 Clone the Repository
https://github.com/mayank06-T/Employee-Management-System

2. ⚙️ Configure MySQL
Create a MySQL database named employee_db

Run the SQL script inside /db/employee_db.sql to create the employees table

3. 🔐 Set DB Credentials
Update your DB credentials in the Java code (typically in EmployeeDAO.java):

String url = "jdbc:mysql://localhost:3306/employee_db";
String user = "your_mysql_username";
String password = "your_mysql_password";



4. ▶️ Run the App
Open project in NetBeans or IntelliJ

Run Main.java

