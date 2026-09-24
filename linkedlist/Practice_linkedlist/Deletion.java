package Practice_linkedlist;

public class Deletion {
    private int data;
    private Deletion next;
    Deletion(int data){
        this.data= data;

    }
    Deletion(int data,Deletion next){
        this.data= data;
        this.next=next;
    }
    public Deletion deletion(int x,Deletion start){
        if(start==null || start.data>x){
            return start;
        }
        if(start.data==x){
            return start.next;
        }
        for(Deletion i=start;i!=null;i=i.next){
            if(i.next.data>x){
                break;
            }
            if(i.next.data==x){
                i.next=i.next.next;
                break;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Deletion start= new Deletion(10);
        Deletion p=start;
        for(int i=2;i<=10;i++){
            p.next= new Deletion(i*10);
            p=p.next;
        }
        System.out.println("Original List");
        for(Deletion i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }

        int x=50;
        start=start.deletion(x, start);
        System.out.println("after deletion List");
        for(Deletion i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }

    }
    
}
