package Practice_linkedlist;

public class ExInsertion {
    private int data;
    private ExInsertion next;
    ExInsertion(int data){
        this.data= data;
    }
    ExInsertion(int data,ExInsertion next){
        this.data= data;
        this.next= next;
    }
    public ExInsertion insert(ExInsertion first,int x){
        if(first==null || first.data>x){
            first = new ExInsertion(x);
            return first;
        }
        ExInsertion p= first;
        while(p.next!=null){
            if(p.next.data>x){
                break;
            }
            p=p.next;
        }
        p.next=new ExInsertion(x,p.next);
        return first;
    }
    public static void main(String[] args) {
        ExInsertion node= new ExInsertion(10);
        ExInsertion p=node;
        for(int i=2;i<=10;i++){
            p.next= new ExInsertion(i*10);
            p=p.next;
        }
        System.out.println(" Original list : ");
        for(ExInsertion i=node;i!=null;i=i.next){
            System.out.println(i.data);
        }

        int x= 45;
        node=node.insert(node, x);
         System.out.println(" After insertion list : ");
        for(ExInsertion i=node;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
}
