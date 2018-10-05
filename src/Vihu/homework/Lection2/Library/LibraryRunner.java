package Vihu.homework.Lection2.Library;

public class LibraryRunner {

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook();
        System.out.println(library.bookSearch(1970));
        System.out.println(library.bookSearch("author", "Petrov"));
    }
}
