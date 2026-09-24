public class SumOfNodes {
    
    public int data;
    public SumOfNodes next;
    public SumOfNodes(int data) 
    {
        this.data=data;
    }
    public static void main(String[] args) {
    SumOfNodes start =  new SumOfNodes(10);
    SumOfNodes p= start;
   for (int i=2; i<=10; i++)
    {
    p.next = new SumOfNodes(i*10);
    p=p.next;
}
 int sum = 0;
 
    for (SumOfNodes i=start; i!=null; i=i.next){
         System.out.println(i.data);
         sum += i.data;
        }
    System.out.println("Sum of all nodes: "+sum);
    }
}
