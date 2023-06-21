import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("Silo", "Hugh Howey", "Fiction");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Silo", book.getTitle());
    }


}
