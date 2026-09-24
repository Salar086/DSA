public class SearchOfNodes{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        boolean search(Node start, int x){
            Node current = start;
            while(current != null){
                if(current.data == x){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
        public static void main(String[] args) {
           Node head = new Node(10);
           Node p = head;
           for(int i=2; i<=10; i++){
               p.next = new Node(i*10);
               p = p.next; 

        }
        int x = 20;
            if(head.search(head, x)){
                System.out.println(x + " is found in the linked list.");
            } else {
                System.out.println(x + " is not found in the linked list.");
            }
        }
    }
}