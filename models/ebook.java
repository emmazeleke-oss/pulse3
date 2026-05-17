package library.models;

// Inheritance + Method Overriding + super keyword
public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, String isbn, double fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "EBook: " + getTitle() + " by " + getAuthor() + " [Size: " + fileSize + "MB]";
    }
}

