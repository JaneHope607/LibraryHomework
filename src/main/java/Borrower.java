import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

    public void canAddToCollection(Library library) {
        this.borrowedBooks.add(library.removeBook());
    }
}
