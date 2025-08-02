# Store Management App

A Java desktop application for managing store inventory using full CRUD operations (Create, Read, Update, Delete). This app allows users to add, update, delete, and search for products, and it connects to a MySQL database for data persistence.

## Features

- Add new products with name, price, quantity, and category
- View all products in a table
- Edit existing product information
- Delete products from the database
- Search for products by name
- Connects to MySQL using JDBC

## Technologies Used

- Java (Swing for GUI)
- MySQL
- JDBC (Java Database Connectivity)
- NetBeans IDE (or any preferred IDE)

## Project Structure

- `DB.java` – Handles database connection and query execution
- `Store.java` – Main GUI window for managing products
- `Product.java` – Data model class
- `db.sql` – SQL script to create the required database and table

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/MahmoudAhmad704/Store-CRUD-App.git
