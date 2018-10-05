package Vihu.homework.Lection2.Library;

public class Book {
    private final String name;
    private final String author;
    private final String publisher;
    private final int year;
    private final int countOfPages;
    private final double price;
    private final String type;


    public Book(String name, String author, String publisher, int year, int countOfPages, double price, String type) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.countOfPages = countOfPages;
        this.price = price;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year='" + year + '\'' +
                ", countOfPages='" + countOfPages + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
