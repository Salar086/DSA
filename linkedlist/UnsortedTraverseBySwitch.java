

public class UnsortedTraverseBySwitch {
    private int data;
    private UnsortedTraverseBySwitch next;

    public UnsortedTraverseBySwitch(int data) {
        this.data = data;
    }
    public UnsortedTraverseBySwitch(int data, UnsortedTraverseBySwitch next) {
        this.data = data;
        this.next = next;
    }
        public static void main(String[] args) {
    
    UnsortedTraverseBySwitch start = null;
UnsortedTraverseBySwitch p = null;
            int data = 0;

            for (int i = 1; i <= 5; i++) {
                switch (i) {
                    case 1:         
                        data = 180;
                        break;
                    case 2:
                        data = 890;
                        break;
                    case 3:
                        data = 80;
                        break;
                    case 4:
                        data = 60;
                        break;
                    case 5:
                        data = 20;
                        break;
                }
                UnsortedTraverseBySwitch newNode = new UnsortedTraverseBySwitch(data);
    if(start==null){
        start=newNode;
        p=start;
    }
    else{
        p.next=newNode;
        p=p.next;
    }

    
    
}
for (UnsortedTraverseBySwitch i = start; i != null; i = i.next) {
    System.out.println(i.data);}


}
}
