public interface ListADT<T>{
    void addFirst(T value);
    void addLast(T value);
    void addElementAt(T value, int index);
    T getElementAt(int index);
    void removeElementAt(int index);
    void removeFirst();
    void removeLast();
    T first();
    T last();
    Boolean isEmpty();
    int size();
}
