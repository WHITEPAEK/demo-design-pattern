package visitor.book;

// Concrete Visitor
public class BookSearchVisitor implements Visitor {

    private String searchKeyword;

    public BookSearchVisitor(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    @Override
    public void visit(NoveBook book) {
        if (book.getTitle().contains(searchKeyword) || book.getAuthor().contains(searchKeyword)) {
            System.out.println("소설 도서 발견: " + book.getTitle());
        }
    }

    @Override
    public void visit(TechnicalBook book) {
        if (book.getTitle().contains(searchKeyword) || book.getField().contains(searchKeyword)) {
            System.out.println("전문 서적 발견: " + book.getTitle());
        }
    }
}
