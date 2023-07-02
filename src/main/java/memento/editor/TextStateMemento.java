package memento.editor;

// Memento
public class TextStateMemento {

    private final String text;

    public TextStateMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
