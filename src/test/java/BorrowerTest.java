import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;


    @Before
    public void before() {
        ArrayList<Book> testCollection = new ArrayList<>();
        library = new Library(testCollection, 6);
        borrower = new Borrower(library);
        book1 = new Book("Silo", "Hugh Howey", "Fiction");
        library.addBook(book1);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(book1);
        assertEquals(1, borrower.hasBook());
    }
}
