package Practice_linkedlist;

public class ArrayIntoLinkedlist {
    private int data;
    private ArrayIntoLinkedlist next;
    private static ArrayIntoLinkedlist start;

    ArrayIntoLinkedlist (int data){
        this.data= data;
    }

    ArrayIntoLinkedlist (int data,ArrayIntoLinkedlist  next){
        this.data=data;
        this.next= next;
    }

    public static void main(String[] args) {
        int[] arr={2,4,65,32,12,45};
        start = null;

        System.out.println("our Original array : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("coverting into list : ");
        for(int val:arr){
            start = new ArrayIntoLinkedlist(val, start);
        }
    }
}
