import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> byGenre;

    public Library(ArrayList<Book> books, int capacity){
        this.books = books;
        this.capacity = capacity;
    }
    public int getBookCount(){
        return books.size();
    }
    public void addBook(Book book){
        if(books.size() < capacity) {
            books.add(book);
        }
    }
    public HashMap<String, Integer> findGenres(){
        int total = 0;
        for (Book book : books) {
            byGenre.put(book.getGenre(), total+1);
        }
        return byGenre;
    }
}
