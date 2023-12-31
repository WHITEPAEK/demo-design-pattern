package bridge.list;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {

    public LinkedList<T> linkedList;

    public LinkedListImpl() {
        this.linkedList = new LinkedList<T>();
        System.out.println("LinkedList로 구현합니다.");
    }

    @Override
    public T getElement(int i) {
        return linkedList.get(i);
    }

    @Override
    public int getElementSize() {
        return linkedList.size();
    }

    @Override
    public void addElement(T obj) {
        linkedList.add(obj);
    }

    @Override
    public int insertElement(T obj, int i) {
        linkedList.add(i, obj);
        return i;
    }

    @Override
    public T deleteElement(int i) {
        return linkedList.remove(i);
    }
}
