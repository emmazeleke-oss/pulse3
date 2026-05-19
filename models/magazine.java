package library
interface Borrowable {
    void borrow();
    void returnItem();
}

public class Magazine implements Borrowable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed magazine: " + name);
    }

    @Override
    public void returnItem() {
        System.out.println("Returned magazine: " + name);
    }
}

