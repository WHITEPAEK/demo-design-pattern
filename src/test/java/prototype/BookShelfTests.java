package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfTests {

    @Test
    void clone_not_same() throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("백승주", "IntelliJ IDEA 프로젝트에 활용하기"));

        BookShelf anBookShelf = (BookShelf) bookShelf.clone();
        assertNotSame(bookShelf, anBookShelf);
        assertEquals(bookShelf.toString(), anBookShelf.toString());

        bookShelf.getShelf().get(0).setAuthor("이한성");
        assertNotEquals(bookShelf.toString(), anBookShelf.toString());
    }

}
