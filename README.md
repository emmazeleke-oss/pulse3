# Online Shop Management System

A short and clean Java application demonstrating core Object-Oriented Programming (OOP) principles using modern Java features.

## 📌 OOP Concepts Implemented

*   Encapsulation: Used private fields with public getters and setters to protect data integrity.
*   Abstraction: Implemented via the Sellable interface and the abstract base class Product.
*   Inheritance: The Electronics class uses extends to inherit properties from the Product parent class.
*   Polymorphism: A single ArrayList<Product> handles both default and dynamically added subclasses seamlessly using method overriding (`displayInvoice()`).
*   Package Structure: Core logic is neatly organized inside the management package.
*   Modern Java Features: Utilizes local variable type inference (`var`) and automatic resource management via try-with-resources.
*   Robustness: Includes user input validation using a Scanner wrapped inside a try-catch block to handle exceptions.

## 📁 Project Structure

```text
.
├── Main.java                 # Application Entry Point
└── management/               # Custom Package
    └── ShopSystem.java       # Product, Electronics, and Sellable Interface
