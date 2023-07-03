package iterator.book;

import org.junit.jupiter.api.Test;

class BookTests {

    @Test
    void book_iterator_test() {
        Library library = new Library();
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Design Patterns"));
        library.addBook(new Book("Data Structures and Algorithms"));

        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }

}
