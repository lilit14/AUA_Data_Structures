public class SnapshotArrayListIterator<T> implements MyIterator<T> {
    ArrayList<T> list;
    int index;

    public SnapshotArrayListIterator(ArrayList<T> list) {
        this.list = new ArrayList<>(list.size());
        for (int index=0;index< list.size();index++) {
            this.list.addLast(list.getElementAt(index));
        }
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
