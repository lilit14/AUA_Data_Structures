public class Main {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>(2);
        list.addLast("1");
        list.addLast("2");
        list.addFirst("0");
        list.addLast("4");
        list.addElementAt("3",3);
        list.addLast("5");
        list.addLast("6");
        list.removeElementAt(5);
        list.removeLast();
        list.removeFirst();


        for (String element:list) {
            System.out.println(element);
        }

        System.out.println();
        for (MyIterator<String> it = list.snapshotIterator(); it.hasNext(); ) {
            String element = it.next();
            System.out.println(element);
        }
    }
}
