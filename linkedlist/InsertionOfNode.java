public class InsertionOfNode {
    public int data;
    public InsertionOfNode next;
    public InsertionOfNode(int data) 
    {
        this.data=data;
    }
    public InsertionOfNode(int data, InsertionOfNode next) 
    {
        this.data=data;
        this.next=next;
    }
    public InsertionOfNode insert(InsertionOfNode first, int x) {
        if (first == null || first.data > x) {
            first = new InsertionOfNode(x, first);
            return first;
        }
        InsertionOfNode p = first;
        while (p.next != null) {
            if (p.next.data > x) {
                break;
             } p = p.next;
            
        }
        p.next = new InsertionOfNode(x, p .next);
        return first  ;
    }
    public static void main(String[] args) {
        InsertionOfNode head = new InsertionOfNode(10);
        InsertionOfNode p=head ;
        for(int i=2;i<=10;i++){
            p.next=new InsertionOfNode(i*10);
            p=p.next;
        }
       
        System.out.println("Before Insertion");

        
        for (InsertionOfNode i=head; i!=null; i=i.next){
            System.out.println(i.data);
            
        }
        head = head.insert(head, 55);
          
        System.out.println("After Insertion");
        
        for (InsertionOfNode i=head; i!=null; i=i.next){
            System.out.println(i.data);
        }
      
    }

}
