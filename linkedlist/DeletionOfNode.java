public class DeletionOfNode {
    private int data;
    private DeletionOfNode next;

    public DeletionOfNode(int data){
        this.data = data;
    }
    public DeletionOfNode(int data, DeletionOfNode next){
        this.data = data;
        this.next = next;
    }
    DeletionOfNode DeleteNode(DeletionOfNode start,int x){
        if(start == null || start.data > x){
            return start;
        }
        if(start.data == x){
            return start.next;
        }
       for(DeletionOfNode i=start;i.next!=null;i=i.next){
            if(i.next.data > x)
                break;
            if(i.next.data == x){
                i.next = i.next.next;
                break;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        DeletionOfNode start = new DeletionOfNode(10);
        DeletionOfNode p = start;
        for (int i = 2; i <= 10; i++) {
            p.next = new DeletionOfNode(i * 10);
            p = p.next;
        }

        System.out.println("Before deletion:");
        for (DeletionOfNode i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }

        int x = 50;
        start = start.DeleteNode(start, x);

        System.out.println("After deleting " + x + ":");
        for (DeletionOfNode i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }   
}
    
