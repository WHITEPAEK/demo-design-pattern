package iterator.book;

import java.util.ArrayList;
import java.util.List;

// Concrete Aggregate
public class Library implements BookCollection {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }
}
