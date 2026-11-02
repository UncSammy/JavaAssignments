import java.util.ArrayList;

public class User {

    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get user name
    public String getName() {
        return name;
    }

    // Get user age
    public int getAge() {
        return age;
    }

    // Get borrowed books
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Add a borrowed book
    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    // Remove a returned book
    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");

        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
        }

        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }
}