import java.util.ArrayList;

public class Borrower {

    private Library library;
    private ArrayList<Book> collection;

    public Borrower(Library library) {
        this.collection = new ArrayList<>();
        this.library = library;
    }

    public int hasBook() {
        return this.collection.size();
    }

    public void borrowBook(Book book) {
        this.library.removeBook(book);
        this.collection.add(book);
    }
}
