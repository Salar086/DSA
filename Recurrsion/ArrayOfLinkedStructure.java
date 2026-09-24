public class ArrayOfLinkedStructure {

    // Node of linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive function to print one linked list
    static void printlist(Node current){
        if(current==null){
            return;
        }
        System.out.println( current.data);
        printlist(current.next);
    }
    
    // Recursive function to print the whole array
    static void printArray(Node[]a,int index){
        if(index==a.length){
            return;
        }
        System.out.println("Index "+ index + ": ");
        printlist(a[index]);

        System.out.println();

        printArray(a, index+1);

    }
   

    public static void main(String[] args) {

        // Array of linked structure
        Node[] arr = new Node[5];

        // Index 0 → 10 → 20 → 30
        arr[0] = new Node(10);
        arr[0].next = new Node(20);
        arr[0].next.next = new Node(30);

        // Index 1 → 40 → 50
        arr[1] = new Node(40);
        arr[1].next = new Node(50);

        // Index 2 → 60 → 70 → 80 → 90
        arr[2] = new Node(60);
        arr[2].next = new Node(70);
        arr[2].next.next = new Node(80);
        arr[2].next.next.next = new Node(90);

        // Index 3 → 100 → 110
        arr[3] = new Node(100);
        arr[3].next = new Node(110);

        // Index 4 → 120 → 130 → 140 → 150
        arr[4]= new Node(120);
        arr[4].next= new Node(130);
        arr[4].next.next= new Node(140);
        arr[4].next.next.next= new Node(150);


        // Print using recursion
        printArray(arr, 0);
    }
}