package Vihu.homework.Lection2.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private final ArrayList<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public String bookSearch(String type, String typeValue) {
        int temp = 0;
        String tempString = "";
        if (type.equals("author") || type.equals("Author")) {
            for (Book book : books) {
                if (book.getAuthor().equals(typeValue)) {
                    temp++;
                    tempString += book.toString() + "\n";
                }
            }
        }
        if (type.equals("publisher") || type.equals("Publisher")) {
            for (Book book : books) {
                if (book.getPublisher().equals(typeValue)) {
                    temp++;
                    tempString += book.toString() + "\n";
                }
            }
        }
        if (temp == 0) {
            return "No books";
        } else {
            return tempString;
        }
    }

    public String bookSearch(int year) {
        int temp = 0;
        String tempString = "";
        for (Book book : books) {
            if (book.getYear() > year) {
                temp++;
                tempString += book.toString() + "\n";
            }
        }
        if (temp == 0) {
            return "No books";
        } else {
            return tempString;
        }
    }

    public void addBook() {
        String n = "yes";
        while (n.equals("yes") || n.equals("Yes")) {
            System.out.println("Input your book: \n Book name: ");
            String name = sc.next();
            System.out.println("Book author: ");
            String author = sc.next();
            System.out.println("Book publisher: ");
            String publisher = sc.next();
            System.out.println("Book year: ");
            int year = sc.nextInt();
            System.out.println("Book countOfPages: ");
            int countOfPages = sc.nextInt();
            System.out.println("Book price: ");
            double price = sc.nextDouble();
            System.out.println("Book type: ");
            String type = sc.next();
            Book book = new Book(name, author, publisher, year, countOfPages, price, type);
            books.add(book);
            System.out.println("Wanna add new line? (yes/no)");
            n = sc.next();
        }
    }
}