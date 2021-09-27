public class PersonsArrayQueue implements QueueADT<Person> {

    private int capacity = 10;
    private Person []persons;
    private int size = 0;
    private int head = 0;

    public PersonsArrayQueue(int capacity) {
        this.capacity=capacity;
        persons = new Person[capacity];
    }

    public PersonsArrayQueue() {
        persons = new Person[capacity];

    }

    @Override
    public void enqueue(Person element) {
        resize();
        persons[(head+size)%persons.length]=element;
        size++;
    }

    @Override
    public Person dequeue() {
        if(isEmpty()){
            return null;
        }
        Person tmp = persons[head];
        persons[head] = null;
        if( head==persons.length-1){
            head=0;
        }
        else {
            head += 1;
        }
        size--;
        return tmp;
    }

    @Override
    public Person first() {
        if(isEmpty()){
            return null;
        }
        return persons[head];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void empty() {
        head=0;
        size=0;
        persons = new Person[capacity];
    }


    private void resize_dummy_version() {
        if (size>=persons.length) {
            Person[] tmp = new Person[persons.length * 2];
            int tmpIndex = 0;
            for (int index = head; index < persons.length && tmpIndex < size; index++, tmpIndex++) {
                tmp[tmpIndex] = persons[index];
            }
            for (int index = 0; index < head; index++, tmpIndex++) {
                tmp[tmpIndex] = persons[index];
            }
            head=0;
            persons = tmp;
        }

    }

    private void resize() {
        if (size>=persons.length) {
            Person[] tmp = new Person[persons.length * 2];
            for (int index = head, tmpIndex = 0; index < head + size; index++, tmpIndex++) {
                tmp[tmpIndex] = persons[index % persons.length];
            }
            head=0;
            persons = tmp;
        }
    }
}
