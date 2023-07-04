package visitor.book;

// Visitor
public interface Visitor {

    void visit(NoveBook book);
    void visit(TechnicalBook book);

}
