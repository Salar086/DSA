package Practice_linkedlist;

public class Sublist {
    private int data;
    private Sublist next;
    Sublist(int data){
        this.data=data;
    }
    Sublist(int data,Sublist next){
        this.data=data;
        this.next=next;
    }
    public static void main(String[] args) {
         Sublist startList= new Sublist(10);
        Sublist p=startList;
        for(int i=2;i<=10;i++){
            p.next= new Sublist(i*10);
            p=p.next;
        }
       System.out.println("Original list : ");
        for(Sublist i=startList;i!=null;i=i.next){
            System.out.println(i.data);
            
        }

        int rangeStart = 40;
        int end = 80;
        Sublist head = null;
        Sublist tail = null;
        for(Sublist current = startList; current != null; current = current.next){
            if(current.data >= rangeStart && current.data <= end){
            
                if(head == null){
                    head = new Sublist(current.data);
                    tail = head;
                }
                else{
                    tail.next = new Sublist(current.data);
                    tail = tail.next;

                }
            }
        }
        System.out.println("sublist is : ");
        for(Sublist i=head;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
}
