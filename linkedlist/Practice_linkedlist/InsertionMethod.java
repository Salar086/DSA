package Practice_linkedlist;

public class InsertionMethod {
    private int data;
    private InsertionMethod next;
    InsertionMethod(int data){
        this.data=data;
    }
    InsertionMethod(int data,InsertionMethod next){
        this.data=data;
        this.next=next;
    }
   public InsertionMethod insert(InsertionMethod first,int x){
    if(first==null || first.data>x){
        first = new InsertionMethod(x,first);
        return first;
    }
    InsertionMethod p=first;
    while(p.next!=null){
        if(p.next.data>x){
            break;
        }
        p=p.next;
    }
    p.next= new InsertionMethod(x,p.next);
    return first;
   }
   public static void main(String[] args) {
    
      InsertionMethod start= new InsertionMethod(10);
           InsertionMethod p=start;
            for(int i=2;i<=10;i++){
                p.next=new InsertionMethod(i*10);
                p=p.next;
            }

            System.out.println(" Original linkedlist ");
            for(InsertionMethod i=start;i!=null;i=i.next){
                System.out.println(i.data);
            }

            int x= 45;
            start=start.insert(start,x);
            System.out.println(" After Insertion linkedlist ");
            for(InsertionMethod i=start;i!=null;i=i.next){
                System.out.println(i.data);
            }
   }
}
