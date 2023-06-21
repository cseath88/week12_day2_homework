import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> bookStock;
    private int capacity;


    public Library(ArrayList<Book> bookStock, int capacity) {
        this.bookStock = bookStock;
        this.capacity = 6;
    }

    public int totalBooks() {
        return this.bookStock.size();
    }

    public void addBook(Book book) {
        if (this.bookStock.size() < this.capacity) {
            this.bookStock.add(book);
        }
    }

    public void removeBook(Book book) {
        bookStock.remove(book);
    }

}
