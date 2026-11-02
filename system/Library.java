package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book)
                && !book.isReserved()
                && !member.getBorrowedBooks().contains(book)) {

            books.remove(book);
            member.addBorrowedBook(book);

            System.out.println(member.getName()
                    + " borrowed " + book.getTitle());

        } else {
            System.out.println("Book cannot be borrowed.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {

            member.removeBorrowedBook(book);
            books.add(book);

            System.out.println(member.getName()
                    + " returned " + book.getTitle());

        } else {
            System.out.println("This member has not borrowed this book.");
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (members.contains(member)
                && books.contains(book)
                && !book.isReserved()
                && !member.hasReservedBook(book)) {

            book.setReserved(true);
            member.addReservedBook(book);

            System.out.println("Book reserved successfully: "
                    + book.getTitle());

        } else {
            System.out.println("Book is already reserved or unavailable.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {

            book.setReserved(false);
            member.removeReservedBook(book);

            System.out.println("Reservation canceled successfully: "
                    + book.getTitle());

        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("\nReserved books for " + member.getName() + ":");

        if (member.getReservedBooks().isEmpty()) {
            System.out.println("No reserved books.");
        } else {
            for (Book book : member.getReservedBooks()) {
                System.out.println(book.getTitle());
            }
        }
    }
}