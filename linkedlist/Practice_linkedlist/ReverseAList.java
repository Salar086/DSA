package Practice_linkedlist;

public class ReverseAList {
    private int data;
    private ReverseAList next;
    ReverseAList (int data){
        this.data= data;

    }
    ReverseAList(int data,ReverseAList next){
        this.data= data;
        this.next = next;
    }
    void  reverseprint(ReverseAList node){
        if(node==null){
            return;
        }
        reverseprint(node.next);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        ReverseAList start= new ReverseAList(1);
        ReverseAList p=start;
        for(int i=2;i<=10;i++){
            p.next= new ReverseAList(i);
            p=p.next;
        }
        System.out.println();
        System.out.println("Original list :");
        for(ReverseAList i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }
        System.out.println();
        System.out.println("Reverse Printing of List : ");
        start.reverseprint(start);
    }
}
