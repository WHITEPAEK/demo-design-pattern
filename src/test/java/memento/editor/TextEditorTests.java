package memento.editor;

import org.junit.jupiter.api.Test;

class TextEditorTests {

    @Test
    void text_editor_undo_test() {
        TextEditor textEditor = new TextEditor();

        System.out.println();
        textEditor.insertText("Hello, ");
        textEditor.insertText("World!");
        textEditor.printCurrentText();
        System.out.println("==========");

        textEditor.getUndoList();
        System.out.println("==========");

        textEditor.deleteText(7, 13);
        textEditor.printCurrentText();
        System.out.println("==========");

        textEditor.getUndoList();
        System.out.println("==========");

        textEditor.undo();
        textEditor.printCurrentText();
        System.out.println("==========");

        textEditor.getUndoList();
        System.out.println("==========\n");

        textEditor.undo();
        textEditor.undo();
        System.out.println("==========");

        textEditor.printCurrentText();
        System.out.println("==========\n");
    }

}
