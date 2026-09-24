package Practice_linkedlist;

public class Reverseprintingwitharray {
    private int data;
    private Reverseprintingwitharray next ;
    
    Reverseprintingwitharray (int data){
        this.data= data;
    }

    Reverseprintingwitharray (int data, Reverseprintingwitharray next ) {
        this.data=data;
        this . next =next;
    }
    public static void main(String[] args) {
        Reverseprintingwitharray start = new Reverseprintingwitharray(10);
        Reverseprintingwitharray p = start;
        for (int i = 2; i <= 10; i++) {
            p.next = new Reverseprintingwitharray(i * 10);
            p = p.next;
        }

        System.out.println("Linked list :");
        int count = 0;
        Reverseprintingwitharray current = start;
        while (current != null) {
            System.out.println(current.data);
            count++;
            current = current.next;
        }
                     

        int[] arr=new int[count];
        int index =0;
        for(Reverseprintingwitharray i=start;i!=null;i=i.next){
            arr[index]=i.data;
            index++;
        }

        System.out.println("our reversed array is :");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
