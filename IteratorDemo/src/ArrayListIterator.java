public class ArrayListIterator<T> implements MyIterator<T> {
    ArrayList<T> list;
    int index;

    public ArrayListIterator(ArrayList<T> list) {
        this.list = list;
        index=0;
    }

    @Override
    public boolean hasNext() {
        if (index<list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        T element = list.getElementAt(index);
        index+=1;
        return element;
    }

}
