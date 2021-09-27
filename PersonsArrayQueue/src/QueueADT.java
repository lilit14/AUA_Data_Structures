public interface QueueADT <T> {

    void enqueue(T element); //push, add last
    T dequeue(); //pop, get First and remove
    T first(); //top
    boolean isEmpty();
    void empty(); //clean up
}
