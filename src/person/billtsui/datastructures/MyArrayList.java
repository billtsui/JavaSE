package person.billtsui.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author billtsui
 * @date 2020/12/27
 */
public class MyArrayList<T> implements Iterable<T> {
    private static final int DEFAULT_CAPACITY = 10;
    //元素的个数
    private int theSize;

    //存放元素的数组
    private T[] items;

    public MyArrayList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void trimToSize() {
        ensureCapacity(size());
    }

    public T get(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return items[idx];
    }

    public T set(int idx, T newVal) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        T old = items[idx];
        items[idx] = newVal;
        return old;
    }

    public int size() {
        return theSize;
    }

    public boolean add(T val) {
        add(size(), val);
        return true;
    }

    public void add(int idx, T val) {
        if (items.length == size()) {
            ensureCapacity(size() * 2 + 1);
        }

        //从idx后的元素，往后移动一位
        for (int i = theSize; i > idx; i--) {
            items[i] = items[i - 1];
        }
        theSize++;
    }

    public T remove(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T removeItem = items[idx];
        for (int i = idx; i < size() - 1; i++) {
            items[i] = items[i + 1];
        }
        theSize--;
        return removeItem;
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize) {
            return;
        }
        T[] old = items;
        items = (T[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            items[i] = old[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                return items[current++];
            }
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(--current);
        }
    }
}
