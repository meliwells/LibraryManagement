package learn.library.data.model;

public class Book {
    public String category;
    public int shelfNumber;
    public int shelfPosition;
    public int yearPublished;
    public String author;
    public String isbn;

    public Book() {
    }

    public Book(String category, int shelfNumber, int shelfPosition, int yearPublished, String author, String isbn) {
        this.category = category;
        this.shelfNumber = shelfNumber;
        this.shelfPosition = shelfPosition;
        this.yearPublished = yearPublished;
        this.author = author;
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getShelfPosition() {
        return shelfPosition;
    }

    public void setShelfPosition(int shelfPosition) {
        this.shelfPosition = shelfPosition;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
