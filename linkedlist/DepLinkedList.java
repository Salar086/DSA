class Dep {
    String depname;
    int id;
    String Uniname;
    public Dep(String depname,int id,String Uniname){
        this.depname=depname;
        this.id=id;
        this.Uniname=Uniname;
    }
    
}
public class DepLinkedList{
    private Dep data;
    private DepLinkedList next;

    public DepLinkedList(Dep data,DepLinkedList next){
        this.data= data;
        this.next= next; 
    }
    public DepLinkedList(Dep data){
        this(data, null);
    }
    public static void main(String[] args) {
        Dep d1=new Dep("CS",1234,"Mehran");
        Dep d2=new Dep("CS",214,"Mehran");
        Dep d3=new Dep("SW",999,"Mehran");

        DepLinkedList start=null;
        DepLinkedList p= null;
        Dep[] arr ={d1,d2,d3};
        for(int i=0;i<arr.length;i++){
            DepLinkedList newnode = new DepLinkedList(arr[i]);
            if(start==null){
                start=newnode;
                p=newnode;
            }
            else {
                p.next=newnode;
                p=p.next;
            }
        }
        for(DepLinkedList i=start;i!=null;i=i.next){
            System.out.println("DepName = " + i.data.depname);
            System.out.println("DepId = " + i.data.id);
            System.out.println("DepName = " + i.data.Uniname);
            System.out.println();
        }
        }
    }

