
public class ArrayList<T> implements ListADT<T>, MyIterable<T> {

    private T[] array;
    int size;

    public ArrayList(int initialCapacity) {
        array = (T[]) new Object[initialCapacity];
        size = 0;
    }

    public ArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public void addFirst(T value) {
        addElementAt(value, 0);
    }

    @Override
    public void addLast(T value) {
        addElementAt(value, size);
    }

    @Override
    public void addElementAt(T value, int index) {
        addCapacity();
        shiftToRight(index);
        array[index] = value;
        size += 1;
    }

    @Override
    public T getElementAt(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;

    }

    @Override
    public void removeElementAt(int index) {
        if (index >= 0 && index < size) {
            shiftToLeft(index);
            removeLast();
        }
    }

    @Override
    public void removeFirst() {
        if (size > 0) {
            shiftToLeft(0);
            removeLast();
        }
    }

    @Override
    public void removeLast() {
        if (size > 0) {
            array[size - 1] = null;
            size -= 1;
        }
    }

    @Override
    public T first() {
        if (size > 0) {
            return array[0];
        }
        return null;
    }

    @Override
    public T last() {
        if (size > 0) {
            return array[size - 1];
        }
        return null;
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void addCapacity() {
        if (size >= array.length) {
            int capacity = array.length;
            T[] newArray = (T[]) new Object[capacity * 2];
            System.arraycopy(array, 0, newArray, 0, capacity);
            array = newArray;
        }
    }

    private void shiftToRight(int startingFrom) {
        addCapacity();
        if (size > startingFrom)
            System.arraycopy(array, startingFrom, array, startingFrom + 1, size + 1 - startingFrom);

    }

    private void shiftToLeft(int startingFrom) {
        if (startingFrom >= 0) System.arraycopy(array, startingFrom + 1, array, startingFrom, size - startingFrom - 1);
    }


    @Override
    public MyIterator<T> iterator() {
        return new ArrayListIterator<T>(this);
    }

    @Override
    public MyIterator<T> snapshotIterator() {
        return new SnapshotArrayListIterator<T>(this);
    }
}
