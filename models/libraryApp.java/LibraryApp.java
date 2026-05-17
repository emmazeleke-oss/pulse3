package library;

import library.models.*;
import java.util.ArrayList;
import java.util.Scanner;

// Main Application
public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("📚 Welcome to Library Management System!");

            // User Input
            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();

            // Add Book
            Book b = new Book(title, author, isbn);
            books.add(b);

            // Add EBook
            EBook eb = new EBook("Java Basics", "James Gosling", "12345", 5.2);
            books.add(eb);

            // Polymorphism: ArrayList<Book> holds both Book and EBook
            System.out.println("\nBooks in library:");
            for (Book book : books) {
                System.out.println(book); // Calls overridden toString()
            }

            // Abstraction Example
            Magazine m = new Magazine("Tech Monthly");
            m.borrow();
            m.returnItem();

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("✅ Program finished.");
        }
    }
}
