package Practice_linkedlist;

public class DetectCycle {
    private int data;
    private DetectCycle next;
    DetectCycle(int data){
        this.data=data;
    }
    DetectCycle (int data,DetectCycle next){
        this.data=data;
        this.next= next;

    }
    boolean hasCycle(DetectCycle start){
        DetectCycle slow=start;
        DetectCycle fast= start;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
     public static void main(String[] args) {
        DetectCycle node= new DetectCycle(10);
     DetectCycle p=node;
        for(int i=2;i<=10;i++){
            p.next= new DetectCycle(i*10);
            p=p.next;
        }
        System.out.println(" Original list : ");
        for(DetectCycle i=node;i!=null;i=i.next){
            System.out.println(i.data);
        }

        System.out.println();
        boolean detectingValue=node.hasCycle(node);
       if(detectingValue==true){
        System.out.println("this list has a cycle . ");
       }
       else{
        System.out.println("this list does not has a cycle . ");
       }
    }
}