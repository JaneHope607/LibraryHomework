import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;
    private int capacity;

    public Library(int capacity) {
        this.book = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.book.size();
    }

    public void addBook(Book book) {
        if (hasSpace()) {
            this.book.add(book);
        }
    }

    public boolean hasSpace() {
        return this.capacity > this.bookCount();
    }

    public Book removeBook() {
        return this.book.remove(0);
    }
}
