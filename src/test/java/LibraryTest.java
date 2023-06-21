import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Book book7;


    @Before
    public void before() {
        book1 = new Book("Silo", "Hugh Howey", "Fiction");
        book2 = new Book("Blood Meridian", "Cormac McCarthy", "Fiction");
        book3 = new Book("City of Thieves", "David Benioff", "Fiction");
        book4 = new Book("Stolen Focus", "Johan Hari", "Non-Fiction");
        ArrayList<Book> testCollection = new ArrayList<>();
        testCollection.add(book1);
        testCollection.add(book2);
        testCollection.add(book3);
        testCollection.add(book4);
        library = new Library(testCollection, 6);
    }

    @Test
    public void canGetBooksAmount() {
        assertEquals(4, library.totalBooks());
    }

    @Test
    public void canAddBook(){
        book5 = new Book("Bingo", "Harry", "Non-Fiction");
        library.addBook(book5);
        assertEquals(5, library.totalBooks());
    }

    @Test
    public void hasCapacity() {
        book5 = new Book("Bingo", "Harry", "Non-Fiction");
        book6 = new Book("asd", "asd", "Non-Fiction");
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(6, library.totalBooks());
    }

    @Test
    public void canRemoveBook() {
        library.removeBook(book1);
        assertEquals(3, library.totalBooks());
    }
}
