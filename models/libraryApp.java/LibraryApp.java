package library;

import library.models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("📚 Welcome to Library Management System!");

        
            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();

        
            Book b = new Book(title, author, isbn);
            books.add(b);

        
            EBook eb = new EBook("Java Basics", "James Gosling", "12345", 5.2);
            books.add(eb);

            
            System.out.println("\nBooks in library:");
            for (Book book : books) {
                System.out.
            }

            
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
