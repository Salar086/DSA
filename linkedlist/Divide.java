public class Divide {

    private int data;
    private Divide next;

    public Divide(int data) {
        this.data = data;
    }

    public Divide(int data, Divide next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {

        Divide start = new Divide(1);
        Divide p = start;

        for (int i = 2; i <= 100; i++) {
            p.next = new Divide(i);
            p = p.next;
        }

        int count = 0;

        System.out.println("Original list elements are:");

        for (Divide i = start; i != null; i = i.next) {
            System.out.print(i.data + " ");
            count++;
        }

        System.out.println("\nTotal elements: " + count);

        int mid = count / 2;

        Divide head1 = null;
        Divide tail1 = null;
        Divide head2 = null;
        Divide tail2 = null;

        Divide i = start;

        // First list: 1 to 50
        for (; i.data <= mid; i = i.next) {

            if (head1 == null) {
                head1 = new Divide(i.data);
                tail1 = head1;
            } 
            else {
                tail1.next = new Divide(i.data);
                tail1 = tail1.next;
            }
        }

        // Second list: 51 to 100
        for (; i != null; i = i.next) {

            if (head2 == null) {
                head2 = new Divide(i.data);
                tail2 = head2;
            } 
            else {
                tail2.next = new Divide(i.data);
                tail2 = tail2.next;
            }
        }

        // Print first list
        System.out.println("\nList 1:");

        for (Divide j = head1; j != null; j = j.next) {
            System.out.print(j.data + " ");
        }

        // Print second list
        System.out.println("\n\nSecond list:");

        for (Divide j = head2; j != null; j = j.next) {
            System.out.print(j.data + " ");
        }
    }
}