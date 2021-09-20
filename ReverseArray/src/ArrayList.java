// please note that ArrayList class is incomplete,
// it has minimal functionality to be able tp satisfy "Reverse array list"  task


public class ArrayList <T> {

    private T list[];
    private int size=0;

    public ArrayList(){
        list = (T[]) new Object[100];
    }

    public void addLast(T element){
        //will not handle the case when size>=capacity
        list[size] = element;
        size+=1;
    }

    public void print(){
        for (int index=0;index<size;index++){
            System.out.print(list[index].toString()+" ");
        }
    }

    public void reverse(){
        reverse_recursively_inPlace(list,0,size);
    }

    private void reverse_recursively_inPlace(T[] list, int index, int size){
        if(index>=(int)size/2){
            return;
        }
        T tmp = list[index];
        list[index]=list[size-index-1];
        list[size-index-1] = tmp;
        reverse_recursively_inPlace(list,index+1,size);
    }
}
