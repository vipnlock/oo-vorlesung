package ch.study.hsr.lecture09.stack;

public class ArrayStackCastElement<T> {

    private Object[] array;
    private int size;

    public ArrayStackCastElement(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    public void push(T element) {
        array[size++] = element;
    }

    public T pop() {
        @SuppressWarnings("unchecked")
        T tmp = (T)array[--size];       // that type cast is always OK, bacuse of push
        array[size] = null;
        return tmp;
    }

    public Object[] getInternals() {
        return array;
    }

}
