package xd;

public class Book {
    private long id;
    private String title;
    private String author;
    private double price;
    private BookGenre genre;

    public Book(long id, String title, String author, double price, BookGenre genre) {
        this.author = author;
        this.id = id;
        this.price = price;
        this.title = title;
        this.genre = genre;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
