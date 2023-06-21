import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Library library;

    @Before
    public void before(){
        book = new Book("Dune", "Frank Herbert", "sci-fi");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book);
        library = new Library(books, 3);
    }
    @Test
    public void hasBooks(){
        assertEquals(2, library.getBookCount());
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(3, library.getBookCount());
    }
    @Test
    public void tooManyBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getBookCount());
    }
    @Test
    public void canGetGenres(){
        assertEquals({"sci-fi" = 1}, library.findGenres());
    }
}
