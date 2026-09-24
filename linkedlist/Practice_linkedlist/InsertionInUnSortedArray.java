package Practice_linkedlist;

public class InsertionInUnSortedArray {
    private int data;
    private InsertionInUnSortedArray next;
    InsertionInUnSortedArray(int data){
        this.data=data;
    }
    InsertionInUnSortedArray(int data,InsertionInUnSortedArray next){
        this.data=data;
        this.next=next;
    }
   public InsertionInUnSortedArray Insertion(int x,InsertionInUnSortedArray first){
    InsertionInUnSortedArray newnode= new InsertionInUnSortedArray(x);
    if(first==null){
        return newnode;
    }
    for(InsertionInUnSortedArray i=first;i!=null;i=i.next){
        if(i.next==null){
            i.next=newnode;
            break;
        }
    }
    return first;
   }
   public static void main(String[] args) {
    int[] arr={10,23,43,212,34,67,54,32,12,45,98};
    InsertionInUnSortedArray start= null;
    InsertionInUnSortedArray p=null;
    for(int i=0;i<arr.length;i++){
        InsertionInUnSortedArray newnode = new InsertionInUnSortedArray(arr[i]);
        if(start==null){
            start= newnode;
            p=newnode;
        }
       else{
        p.next=newnode;
        p=p.next;
       }
       
       }
        System.out.println("Original List ");
       for(InsertionInUnSortedArray i= start;i!=null;i=i.next){
        System.out.println(i.data);
    }
System.out.println("after insertion list");
start= start.Insertion(100,start);
for(InsertionInUnSortedArray i=start ;i!=null;i=i.next){
    System.out.println(i.data);
}

   }
}
