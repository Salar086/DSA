public class LinkedList {

    int data;
    LinkedList next;

    // Constructor
    public LinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    // Method to insert a value at the START
    public LinkedList insertAtStart(LinkedList start, int x) {

        LinkedList newNode = new LinkedList(x);

        newNode.next = start;

        start = newNode;

        return start;
    }

    public static void main(String[] args) {

        // First create an array
        int[] arr = {1, 2, 3, 5, 8, 20};

        // Create linked list from array
        LinkedList start = new LinkedList(arr[0]);
        LinkedList p = start;

        for (int i = 1; i < arr.length; i++) {
            p.next = new LinkedList(arr[i]);
            p = p.next;
        }

        // Print original linked list
        System.out.println("Original list:");

        for (LinkedList j = start; j != null; j = j.next) {
            System.out.print(j.data + " ");
        }

        // Call method
        start = start.insertAtStart(start, 40);

        // Print list after insertion
        System.out.println("\n\nAfter inserting 40 at start:");

        for (LinkedList j = start; j != null; j = j.next) {
            System.out.print(j.data + " ");
        }
    }
}