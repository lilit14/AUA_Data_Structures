public class Main {
    public static void main(String args[]){
        LinkedList<String> linkedList= new LinkedList<String>();
        linkedList.addFirst("we");
        linkedList.addFirst("will");
        linkedList.addFirst("rock");
        linkedList.addFirst("you");
        linkedList.print();
        System.out.println();
        linkedList.reverse();
        linkedList.print();
    }
}
