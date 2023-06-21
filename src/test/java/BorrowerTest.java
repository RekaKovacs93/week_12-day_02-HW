import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Book book;
    private Borrower borrower;
    private ArrayList<Book> borrowedBooks;

    @Before
    public void before(){
        book = new Book("The third policeman", "Flann O'Brian", "fiction");
        borrowedBooks = new ArrayList<>();
        borrowedBooks.add(book);
        borrower = new Borrower(borrowedBooks);
    }
    @Test
    public void canAddBorrowedBooks(){
        assertEquals(1, borrower.borrowedBookCount());
    }
}
