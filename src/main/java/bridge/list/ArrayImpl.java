package bridge.list;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {

    public ArrayList<T> array;

    public ArrayImpl() {
        this.array = new ArrayList<T>();
        System.out.println("Array로 구현합니다.");
    }

    @Override
    public T getElement(int i) {
        return array.get(i);
    }

    @Override
    public int getElementSize() {
        return array.size();
    }

    @Override
    public void addElement(T obj) {
        array.add(obj);
    }

    @Override
    public int insertElement(T obj, int i) {
        array.add(i, obj);
        return i;
    }

    @Override
    public T deleteElement(int i) {
        return array.remove(i);
    }
}
