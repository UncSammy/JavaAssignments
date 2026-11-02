import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int publicationYear;

    // Task 4: Rating and reviews
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0.0;
    }

    // Get title
    public String getTitle() {
        return title;
    }

    // Get author
    public String getAuthor() {
        return author;
    }

    // Get publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Task 4: Set book rating
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 5.");
        }
    }

    // Get book rating
    public double getRating() {
        return rating;
    }

    // Task 4: Add a review
    public void addReview(String review) {
        if (review != null && !review.trim().isEmpty()) {
            reviews.add(review);
        }
    }

    // Get all reviews
    public ArrayList<String> getReviews() {
        return reviews;
    }

    // Get number of reviews
    public int getReviewCount() {
        return reviews.size();
    }
}