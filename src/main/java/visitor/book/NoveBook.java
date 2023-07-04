package visitor.book;

// Concrete Element
public class NoveBook implements Book {

    private String title;
    private String author;

    public NoveBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
