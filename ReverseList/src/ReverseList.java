import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    public static void reverseList(List list){
        reverseList_recursive(list,0,list.size());
    }


    private static void reverseList_recursive(List list, int index, int size){
        if(index>size/2-1){
            return;
        }

        Object element = list.get(index);
        int lastIndex = size-1-index;
        list.set(index,list.get(lastIndex));
        list.set(lastIndex,element);
        reverseList_recursive(list,index+1,size);

    }

    public static void main(String []a){

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");
        linkedList.addFirst("d");
        System.out.println(linkedList);
        reverseList(linkedList);
        System.out.println(linkedList);


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0,1);
        arrayList.add(0,2);
        arrayList.add(0,3);
        arrayList.add(0,4);
        arrayList.add(0,5);


        System.out.println(arrayList);
        reverseList(arrayList);
        System.out.println(arrayList);



    }
}
