import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Create books
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "1111");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "2222");
        Book book3 = new Book("Clean Code", "Robert C. Martin", "3333");

        // Create library members
        LibraryMember member1 = new LibraryMember("Ahmed", 101);
        LibraryMember member2 = new LibraryMember("Ali", 102);

        // Add books and members
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        System.out.println("\n--- Borrowing Books ---");

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        System.out.println("\n--- Returning Books ---");

        library.returnBook(member1, book1);

        System.out.println("\n--- Reserving Books ---");

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book3);

        System.out.println("\n--- Displaying Reserved Books ---");

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        System.out.println("\n--- Testing Reserved Book ---");

        library.borrowBook(member2, book1);

        System.out.println("\n--- Canceling Reservation ---");

        library.cancelReservation(member1, book1);

        System.out.println("\n--- Reserved Books After Cancellation ---");

        library.displayReservedBooks(member1);

        System.out.println("\n--- Library System Test Complete ---");
    }
}