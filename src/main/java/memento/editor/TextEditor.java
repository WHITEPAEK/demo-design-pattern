package memento.editor;

import java.util.Stack;

// Originator
public class TextEditor {

    private StringBuilder text;
    private Stack<TextStateMemento> undoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
    }

    public void insertText(String newText) {
        saveState();
        System.out.println("삽입 | " + newText);
        text.append(newText);
    }

    public void deleteText(int startIndex, int endIndex) {
        saveState();
        System.out.println("삭제 | " + text.substring(startIndex, endIndex));
        text.delete(startIndex, endIndex);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            System.out.println("Before undo | " + text);
            TextStateMemento memento = undoStack.pop();
            text = new StringBuilder(memento.getText());
            System.out.println("After undo | " + text);
        } else {
            System.out.println("실행 취소할 이전 상태가 없습니다.");
        }
    }

    public void getUndoList() {
        System.out.println("[*] " + text.toString());
        System.out.println("--- Stack ---");
        int size = undoStack.size();
        for (int i = size - 1; i >= 0; i--) {
            TextStateMemento memento = undoStack.get(i);
            System.out.println("[" + i + "] " + memento.getText());
        }
    }

    private void saveState() {
        undoStack.push(new TextStateMemento(text.toString()));
    }

    public void printCurrentText() {
        System.out.println("Current Text | \"" + text.toString() + "\"");
    }

}
