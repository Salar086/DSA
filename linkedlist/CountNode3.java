public class CountNode3 {
    public int data;
    public CountNode3 next;
    public CountNode3(int data) 
    {
        this.data=data;
    }
    public static void main(String[] args) {
    CountNode3 start =  new CountNode3(1);
    CountNode3 p= start;
   for (int i=2; i<=10; i++)
    {
    p.next = new CountNode3(i*10);
    p=p.next;
}
 int count = 0;
 
    for (CountNode3 i=start; i!=null; i=i.next){
         System.out.println(i.data);
         count++;
        }
    System.out.println("Count of all nodes: "+count);
    }
}
