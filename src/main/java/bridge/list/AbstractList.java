package bridge.list;

public interface AbstractList<T> {

    T getElement(int i);
    int getElementSize();
    void addElement(T obj);
    int insertElement(T obj, int i);
    T deleteElement(int i);

}
