package Practice_linkedlist;

public class SumOfLinkedList {
      private int data;
    private SumOfLinkedList next;
    SumOfLinkedList(int data){
        this.data=data;
    }
    SumOfLinkedList(int data,SumOfLinkedList next){
        this.data= data;
        this.next= next;
    }
    public static void main(String[] args) {
        SumOfLinkedList start= new SumOfLinkedList(10);
        SumOfLinkedList p=start;
        for(int i=2;i<=10;i++){
            p.next= new SumOfLinkedList(i*10);
            p=p.next;
        }
        int sum=0;
        int count=0;
        for(SumOfLinkedList i=start;i!=null;i=i.next){
            System.out.println(i.data);
            sum+=i.data;
            count++;
        }
        System.out.println("Sum : "+ sum);
        System.out.println("COunt : "+ count);
        System.out.println("The Average of All Nodes Are : "+ sum/count);
}
}