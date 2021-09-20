//extends Iterable to be able to use foreach in main

public interface MyIterable<T> extends Iterable<T>{
    public MyIterator<T> iterator();
    public MyIterator<T> snapshotIterator();
}
