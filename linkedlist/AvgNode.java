public class AvgNode {
    public int data;
    public AvgNode next;

    public AvgNode(int data) 
    {
        this.data=data;
    }
    float avg(){
        int sum=0;
        int count=0;
        for(AvgNode i=this;i!=null;i=i.next){
            sum+=i.data;
            count++;
        }
        return  (sum/count);
    }
    public static void main(String[] args) {
        AvgNode start= new AvgNode(1);
        AvgNode p=start;
        for(int i=2; i<=10;i++){
            p.next= new AvgNode(i);
            p=p.next;
        }
    
   System.out.println("Average of all nodes: "+start.avg());
    }
}
