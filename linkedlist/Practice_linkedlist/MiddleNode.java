package Practice_linkedlist;

public class MiddleNode {
     private int data;
    private MiddleNode next;
    MiddleNode(int data){
        this.data= data;

    }
    MiddleNode(int data,MiddleNode next){
        this.data= data;
        this.next=next;
    }
    public MiddleNode FindMiddle(MiddleNode start){
        MiddleNode slow=start;
        MiddleNode fast= start;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args) {
     MiddleNode start= new MiddleNode(10);
           MiddleNode p=start;
            for(int i=2;i<=10;i++){
                p.next=new MiddleNode(i*10);
                p=p.next;
            }

            System.out.println(" Original linkedlist ");
            for(MiddleNode i=start;i!=null;i=i.next){
                System.out.println(i.data);
            }

            MiddleNode middle = start.FindMiddle(start);
            System.out.println("Middle Node Of The List Is :" + middle.data);
    
    }}