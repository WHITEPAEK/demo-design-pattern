package iterator.book;

import java.util.List;

// Concrete Iterator
public class LibraryIterator implements Iterator<Book> {

    private List<Book> books;
    private int position;

    public LibraryIterator(List<Book> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        Book book = books.get(position);
        position++;
        return book;
    }
}
