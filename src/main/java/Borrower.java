import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower(ArrayList<Book> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }

    public int borrowedBookCount(){
        return borrowedBooks.size();
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
}
