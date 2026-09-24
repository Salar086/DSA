public class UnsortedByArrayAddNodeInEnd {
    private int data;
    private UnsortedByArrayAddNodeInEnd next;

    public UnsortedByArrayAddNodeInEnd(int data) {
        this.data = data;
    }
public UnsortedByArrayAddNodeInEnd(int data, UnsortedByArrayAddNodeInEnd next) {
        this.data = data;
        this.next = next;
    }
   UnsortedByArrayAddNodeInEnd insert(int x, UnsortedByArrayAddNodeInEnd start) {

    UnsortedByArrayAddNodeInEnd newnode = new UnsortedByArrayAddNodeInEnd(x);

    if (start == null) {
        return newnode;
    }
   

    for (UnsortedByArrayAddNodeInEnd i = start; i != null; i = i.next) {

        if (i.next == null) {
            i.next = newnode;
            break;
        }
    }

    return start;
}
    

    public static void main(String[] args) {
        int[] arr = { 10,34,3,2,4,2,12,344,223,45,677,22 };
        UnsortedByArrayAddNodeInEnd start = null;
        UnsortedByArrayAddNodeInEnd p = null;
        for(int i=0;i<arr.length;i++){
            UnsortedByArrayAddNodeInEnd newNode =new UnsortedByArrayAddNodeInEnd (arr[i]);
            if(start==null){
                start=newNode;
                p=newNode;
            }
            else{
                p.next=newNode;
                p=p.next;

            }
        }
        System.out.println("original array ");
        for (UnsortedByArrayAddNodeInEnd i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }
        System.out.println("after Insertion");
      start=start.insert(8999, start);
        for(UnsortedByArrayAddNodeInEnd i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
   
}   