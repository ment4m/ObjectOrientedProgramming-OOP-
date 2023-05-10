package ment.introduction;

public class TextBook {
    private String title;       // Title of the book
    private String author;      // Author's last name
    private String publisher;   // Name of publisher

    // Constructor
    public TextBook(String tBook, String aBook, String pBook){
        this.title = tBook;
        this.author = aBook;
        this.publisher = pBook;
    }

    public TextBook(TextBook object2) {
        this.title = object2.title;
        this.author = object2.author;
        this.publisher = object2.publisher;
    }

    public void set(String tBook, String aBook, String pBook) {
        title = tBook;
        author = aBook;
        publisher = pBook;
    }

    public String toString() {
        // Create a string representing the object.
        String str = "Title: " + title +
                     "\nAuthor: " + author +
                     "\nPublisher: " + publisher;

        return str;
    }
}
