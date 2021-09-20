//extends Iterator to be able to use foreach in main

import java.util.Iterator;

public interface MyIterator<T> extends Iterator<T> {
    // Checks if the next element exists
    public boolean hasNext();

    // moves the cursor/iterator to next element
    public T next();

}
