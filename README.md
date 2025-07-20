# 👨‍💼 Employee Management System

A simple and efficient **desktop-based application** built using **Core Java** with a **Swing GUI**. It provides basic yet powerful functionality to manage employee records using **JDBC** and **MySQL**.

> ✅ Add • 🔁 Update • ❌ Delete • 📋 View Employees  
> 🎯 Built with Java from scratch – no frameworks

---

## 🖥️ Tech Stack

- **Language:** Java (JDK 17 or compatible)
- **UI:** Java Swing (AWT-based GUI)
- **Database:** MySQL
- **Connectivity:** JDBC (Java Database Connectivity)
- **IDE:** NetBeans / IntelliJ / Eclipse (Your choice)

---

## ✨ Features

- 📌 Add new employees with details like Name, Email, Salary, etc.
- 📝 Update existing employee records
- ❌ Delete employees by ID
- 🔎 View all employee data in a table/grid
- 📁 Persistent storage with MySQL
- 🔐 Secure DB connectivity with JDBC

---

## 📂 Project Structure

 plaintext
/EmployeeManagement/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.yourname.ems/
│   │   │   │   ├── Main.java
│   │   │   │   ├── Employee.java
│   │   │   │   ├── EmployeeDAO.java
│   │   │   │   └── EmployeeForm.java
├── db/
│   └── employee_db.sql   # DB creation script
└── README.md


🏁 Getting Started
📥 1. Clone the Repository

https://github.com/mayank06-T/Employee-Management-System

🛠 2. Setup the Database

Open MySQL Workbench or terminal

Run the script located in /db/employee_db.sql

CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    salary DOUBLE
);

🧩 3. Update JDBC Configuration
Open the Java class where JDBC connection is defined (e.g., EmployeeDAO.java) and edit:

String url = "jdbc:mysql://localhost:3306/employee_db";
String username = "your_mysql_username";
String password = "your_mysql_password";

▶️ 4. Run the Application

Open the project in your preferred IDE (e.g., NetBeans or IntelliJ)

Compile and run Main.java

Start managing employee records 🎯

🙋‍♂️ Author
👨‍💻 Mayank Tiwari
📌 Java Developer | Backend & Desktop Applications
🌐 GitHub



