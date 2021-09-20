// please note that LinkedList class is incomplete,
// it has minimal functionality to be able tp satisfy "Reverse linked list"  task


public class LinkedList <T> {

    public class Node<T>{
        T value;
        Node next;
        Node(T value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    private Node head = null;

    public void addFirst(T element){
        Node<T> newNode = new Node<T>(element,head);
        this.head=newNode;
    }

    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value.toString() + " ");
            temp=temp.next;
        }
    }

    public void reverse(){
        this.head = reverse_rec(this.head);
    }

    private Node reverse_rec(Node node){
        if (node.next == null){
            return node;
        }
        Node tail = reverse_rec(node.next);
        node.next = null;
        Node tmp = tail;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=node;
        return tail;
    }

}
