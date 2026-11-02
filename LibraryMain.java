public class LibraryMain {

    public static void main(String[] args) {

        Library library = new Library();

        // Task 1: Create and add books
        System.out.println("=== TASK 1: BOOK MANAGEMENT ===");

        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("\nSearching books by J.R.R. Tolkien:");
        library.findBooksByAuthor("J.R.R. Tolkien");


        // Task 2: Borrow and return books
        System.out.println("\n=== TASK 2: BORROW AND RETURN ===");

        Book borrowedBook = library.borrowBook("Harry Potter");

        library.displayBooks();

        library.returnBook(borrowedBook);

        library.displayBooks();


        // Task 3: Check book availability
        System.out.println("\n=== TASK 3: BOOK AVAILABILITY ===");

        System.out.println(
                "Is Harry Potter available? "
                        + library.isBookAvailable("Harry Potter")
        );

        System.out.println(
                "Is The Hobbit available? "
                        + library.isBookAvailable("The Hobbit")
        );


        // Task 4: Ratings and reviews
        System.out.println("\n=== TASK 4: RATINGS AND REVIEWS ===");

        book1.setRating(5.0);
        book1.addReview("Amazing book!");

        book2.setRating(4.5);
        book2.addReview("Very interesting story.");
        book2.addReview("I enjoyed reading it.");

        book3.setRating(4.0);
        book3.addReview("A classic fantasy book.");

        System.out.println(
                book1.getTitle() + " rating: " + book1.getRating()
        );

        System.out.println("Reviews:");
        for (String review : book1.getReviews()) {
            System.out.println(review);
        }


        // Task 5: Library statistics
        System.out.println("\n=== TASK 5: LIBRARY STATISTICS ===");

        System.out.println(
                "Average book rating: "
                        + library.getAverageBookRating()
        );

        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {
            System.out.println(
                    "Most reviewed book: "
                            + mostReviewed.getTitle()
            );
        } else {
            System.out.println("No book reviews available.");
        }


        // Task 6: User management
        System.out.println("\n=== TASK 6: USER MANAGEMENT ===");

        User user1 = new User("John", 25);
        User user2 = new User("Sarah", 22);

        library.addUser(user1);
        library.addUser(user2);

        library.displayUsers();

        // User borrows a book
        System.out.println("\nJohn borrows The Hobbit:");

        library.borrowBook(user1, "The Hobbit");

        user1.displayBorrowedBooks();

        // Check availability after borrowing
        System.out.println(
                "Is The Hobbit available? "
                        + library.isBookAvailable("The Hobbit")
        );

        // User returns a book
        System.out.println("\nJohn returns The Hobbit:");

        library.returnBook(user1, "The Hobbit");

        user1.displayBorrowedBooks();

        // Find user
        System.out.println("\nSearching for John:");

        User foundUser = library.findUser("John");

        if (foundUser != null) {
            System.out.println(
                    "User found: " + foundUser.getName()
            );
        }

        // Remove user
        library.removeUser("Sarah");

        System.out.println("\nFinal user list:");
        library.displayUsers();


        // Final result
        System.out.println("\n=== ALL TASKS COMPLETED ===");
    }
}