package Practice_linkedlist;

public class mergedlists {
    private int data;
    private mergedlists next;
    mergedlists(int data){
        this.data=data;
    }
    mergedlists(int data,mergedlists next){
        this.data= data;
        this.next=next ;
    }
    public static mergedlists insert(mergedlists start,int x){
    if(start==null||start.data>x){
        start = new mergedlists(x, start);
        return start;
    }
    mergedlists p=start;
    while(p.next!=null){
        if(p.next.data>x){
            break;
        }
        p=p.next;
    }
    p.next = new mergedlists(x, p.next);
    return start;
   }
   public static void main(String[] args) {
    
    //First List initialization.
    mergedlists start1= new mergedlists(10);
    mergedlists p=start1;
    for(int i=2;i<=5;i++){
        p.next=new mergedlists(i*10);
        p=p.next;
    }

    //Second list initialization .
    mergedlists start2=new mergedlists(60);
    mergedlists q=start2;
    for(int i=7;i<=10;i++){
        q.next= new mergedlists(i*10);
        q=q.next;
    }

    mergedlists mergedlist = null;
    p = start1;
    while(p!=null){
        mergedlist = insert(mergedlist,p.data);
        p = p.next;
    }
    q = start2;
    while(q!=null){
        mergedlist = insert(mergedlist,q.data);
        q = q.next;
    }
    
    // printing the mergedlist after combining two diff linkedlists.
    for(mergedlists s=mergedlist;s!=null;s=s.next){
        System.out.println(s.data);
    }
   
   }
}
