package prototype.book;

import java.util.ArrayList;

public class BookShelf implements Cloneable {

    private ArrayList<Book> shelf;

    public BookShelf() {
        this.shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.shelf.add(book);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelf anBookShelf = new BookShelf();
        for (Book book : this.shelf) {
            anBookShelf.addBook(new Book(book.getAuthor(), book.getTitle()));
        }
        return anBookShelf;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "shelf=" + shelf +
                '}';
    }
}
