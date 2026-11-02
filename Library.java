import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> availableBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Task 1: Add a book
    public void addBook(Book book) {
        books.add(book);
        availableBooks.add(book);
    }

    // Task 1: Display all books
    public void displayBooks() {
        System.out.println("Library Books:");

        for (Book book : books) {
            System.out.println(
                    book.getTitle() + " - "
                            + book.getAuthor() + " ("
                            + book.getPublicationYear() + ")"
            );
        }
    }

    // Task 1: Find books by author
    public void findBooksByAuthor(String author) {
        boolean found = false;

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getTitle());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found.");
        }
    }

    // Task 2: Borrow a book
    public Book borrowBook(String title) {
        for (int i = 0; i < availableBooks.size(); i++) {
            Book book = availableBooks.get(i);

            if (book.getTitle().equalsIgnoreCase(title)) {
                availableBooks.remove(i);
                return book;
            }
        }

        System.out.println("Book is not available.");
        return null;
    }

    // Task 2: Return a book
    public void returnBook(Book book) {
        if (book != null && books.contains(book)
                && !availableBooks.contains(book)) {
            availableBooks.add(book);
            System.out.println("Book returned successfully.");
        }
    }

    // Task 3: Check book availability
    public boolean isBookAvailable(String title) {
        for (Book book : availableBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }

        return false;
    }

    // Task 5: Calculate average book rating
    public double getAverageBookRating() {
        double totalRating = 0;
        int ratedBooks = 0;

        for (Book book : books) {
            if (book.getRating() > 0) {
                totalRating += book.getRating();
                ratedBooks++;
            }
        }

        if (ratedBooks == 0) {
            return 0;
        }

        return totalRating / ratedBooks;
    }

    // Task 5: Find most reviewed book
    public Book getMostReviewedBook() {
        Book mostReviewed = null;

        for (Book book : books) {
            if (book.getReviewCount() > 0) {
                if (mostReviewed == null
                        || book.getReviewCount() > mostReviewed.getReviewCount()) {
                    mostReviewed = book;
                }
            }
        }

        return mostReviewed;
    }

    // Task 6: Add a user
    public void addUser(User user) {
        users.add(user);
    }

    // Task 6: Remove a user
    public void removeUser(String name) {
        User user = findUser(name);

        if (user != null) {
            if (user.getBorrowedBooks().isEmpty()) {
                users.remove(user);
                System.out.println("User removed.");
            } else {
                System.out.println("User still has borrowed books.");
            }
        }
    }

    // Task 6: Find a user
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }

        return null;
    }

    // Task 6: Display all users
    public void displayUsers() {
        System.out.println("Library Users:");

        for (User user : users) {
            System.out.println(
                    user.getName() + ", Age: " + user.getAge()
            );
        }
    }

    // Task 6: Borrow a book for a user
    public void borrowBook(User user, String title) {
        if (users.contains(user)) {
            Book book = borrowBook(title);

            if (book != null) {
                user.addBorrowedBook(book);
                System.out.println(user.getName() + " borrowed " + title);
            }
        } else {
            System.out.println("User is not registered.");
        }
    }

    // Task 6: Return a book for a user
    public void returnBook(User user, String title) {
        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.removeBorrowedBook(book);
                returnBook(book);
                System.out.println(user.getName() + " returned " + title);
                return;
            }
        }

        System.out.println("User has not borrowed this book.");
    }
}