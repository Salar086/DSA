public class ReplaceNode {
    private int data;
    private ReplaceNode next;

    public ReplaceNode(int data) {
        this.data = data;
    }

    public ReplaceNode(int data, ReplaceNode next) {
        this.data = data;
        this.next = next;
    }
    ReplaceNode ReplaceData(ReplaceNode start, int OldValue, int newValue) {
        if (start==null || start.data > OldValue) {
            return start;
        }
        for (ReplaceNode i = start; i != null; i = i.next) {
            if (i.data == OldValue) {
                i.data = newValue; // Replace the data with a new value (e.g., multiply by 10)
                break;
            }
        }
        return start;
    }
    

    public static void main(String[] args) {
        ReplaceNode start = new ReplaceNode(10);
        ReplaceNode p = start;
        for (int i = 2; i <= 10; i++) {
            p.next = new ReplaceNode(i * 10);
            p = p.next;
        }

        System.out.println("Before replacement:");
        for (ReplaceNode i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }
        int OldValue = 60;
        int newValue = 600;
        start = start.ReplaceData(start, OldValue, newValue);
        System.out.println("After replacement:");
        for (ReplaceNode i = start; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }
    
}
