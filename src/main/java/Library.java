import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;

    public Library() {
        this.book = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.book.size();
    }

    public void addBook(Book book) {
        this.book.add(book);
    }
}
