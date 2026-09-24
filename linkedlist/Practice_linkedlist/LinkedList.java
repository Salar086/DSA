package Practice_linkedlist;

public class LinkedList {
    private int data;
    private LinkedList next;
    LinkedList(int data){
        this.data=data;
    }
    LinkedList(int data,LinkedList next){
        this.data= data;
        this.next= next;
    }
    public static void main(String[] args) {
        LinkedList start= new LinkedList(10);
        LinkedList p=start;
        for(int i=2;i<=10;i++){
            p.next= new LinkedList(i*10);
            p=p.next;
        }
        for(LinkedList i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
}
