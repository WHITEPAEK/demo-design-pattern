package visitor.book;

// Concrete Element
public class TechnicalBook implements Book {

    private String title;
    private String field;

    public TechnicalBook(String title, String field) {
        this.title = title;
        this.field = field;
    }

    public String getTitle() {
        return title;
    }

    public String getField() {
        return field;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
