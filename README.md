# Library Management System

A clean and lightweight Java application demonstrating core Object-Oriented Programming (OOP) principles using modern Java features.

## 📌 OOP Concepts Implemented

* Abstraction: Implemented via abstract base concepts defining the library items.
* Encapsulation: Protects data integrity by using private variables restricted to access via public getters and setters.
* Inheritance: Specific classes like book, ebook, and magazine use extends to inherit common attributes from their parent library items.
* Method Overriding & Polymorphism: Subclasses override display methods to handle distinct item behaviors seamlessly at runtime inside a dynamic collection.
* Access Modifiers: Uses private for class-level encapsulation and protected to allow safe data access within subclass extensions.
* Packages: Core models and logic are cleanly isolated within the models package.
* Exception Handling: User input streams are managed safely using a try-catch block to handle mismatched input gracefully without crashing the app.

## 📁 Project Structure

```text
.
├── README.md               # Project Documentation
└── models/                 # Custom Package Folder
    ├── libraryApp.java     # Main Application Entry Point
    ├── book.java           # Book Subclass
    ├── ebook.java          # EBook Subclass
    └── magazine.java       # Magazine Subclass
