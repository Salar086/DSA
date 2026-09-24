package Practice_linkedlist;

public class ReversePrinting {
    public int data;
    public ReversePrinting next;
    public ReversePrinting(int data) 
    {
        this.data=data;
    }
    public static void main(String[] args) { 
    ReversePrinting start =  new ReversePrinting(10);
    ReversePrinting p= start;
   for (int i=2; i<=10; i++)
    {
    p.next = new ReversePrinting(i*10);
    p=p.next;
}
    int count=0;
    System.out.println("Printing of Original linked list");
    for (ReversePrinting i=start; i!=null; i=i.next){
         System.out.println(i.data);
         count++;
         
        }

        // reverse printing .
        int[] arr= new int[count];
       ReversePrinting p1=start;
       for(int j=0;j<count ; j++){
        arr[j]=p1.data;
        p1=p1.next;
       }

       System.out.println("reverse printing : ");
       for(int j=count-1;j>=0;j--){
        System.out.println(arr[j]);
       }
    }
}