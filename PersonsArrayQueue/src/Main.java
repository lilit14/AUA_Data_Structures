public class Main {
    public static void main(String []a){
        Person p1= new Person("Name1","Surname1",14);
        Person p2= new Person("Name2","Surname2",14);
        Person p3= new Person("Name3","Surname3",14);
        Person p4= new Person("Name4","Surname4",14);

        PersonsArrayQueue personsArrayQueue = new PersonsArrayQueue(3);
        System.out.println("isEmpty() should be true - is - " + personsArrayQueue.isEmpty());
        System.out.println("dequeue() should be null - is - " + personsArrayQueue.dequeue());

        personsArrayQueue.enqueue(p1);
        System.out.println("enqueue(p1) operation performed");
        System.out.println("isEmpty() should be false - is - " + personsArrayQueue.isEmpty());
        System.out.println("first() should be "+p1+" - is - " + personsArrayQueue.first());

        personsArrayQueue.enqueue(p2);
        System.out.println("enqueue(p2) operation performed");
        System.out.println("first() should be " + p1 + " - is - " + personsArrayQueue.first());

        personsArrayQueue.enqueue(p3);
        System.out.println("enqueue(p3) operation performed");
        System.out.println("first() should be " + p1 + " - is - " + personsArrayQueue.first());

        System.out.println("dequeue() operation performed, return value should be "+p1+ " - is - "+personsArrayQueue.dequeue());
        System.out.println("first() should be " + p2 + " - is - " + personsArrayQueue.first());

        personsArrayQueue.enqueue(p1);
        System.out.println("enqueue(p1) operation performed");

        personsArrayQueue.enqueue(p4);
        System.out.println("enqueue(p4) operation performed");
        System.out.println("resize should have worked");
        System.out.println("first() should be " + p2 + " - is - " + personsArrayQueue.first());

        System.out.println("dequeue() operation performed, return value should be "+p2+ " - is - "+personsArrayQueue.dequeue());
        System.out.println("dequeue() operation performed, return value should be "+p3+ " - is - "+personsArrayQueue.dequeue());
        System.out.println("dequeue() operation performed, return value should be "+p1+ " - is - "+personsArrayQueue.dequeue());
        System.out.println("dequeue() operation performed, return value should be "+p4+ " - is - "+personsArrayQueue.dequeue());

        System.out.println("isEmpty() should be true - is - " + personsArrayQueue.isEmpty());

    }
}
