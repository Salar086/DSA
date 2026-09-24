package Practice_linkedlist;

public class ReplaceNodeValues{

    private int data;
    private ReplaceNodeValues next;

    ReplaceNodeValues(int data){
        this.data= data;
    }
    ReplaceNodeValues(int data, ReplaceNodeValues next){
        this.data=data;
        this.next=next;
    }
    public ReplaceNodeValues replace(ReplaceNodeValues start, int oldval,int newval){
        if(start==null || start.data>oldval){
            return start;
        }
        for(ReplaceNodeValues i=start;i!=null;i=i.next){
            if(i.data==oldval){
                i.data=newval;
                break;
            }
        }
        return start;
    }
        public static void main(String[] args){
            ReplaceNodeValues start= new ReplaceNodeValues(10);
            ReplaceNodeValues p=start;
            for(int i=2;i<=10;i++){
               p.next= new ReplaceNodeValues(i*10) ;
               p=p.next;
            }
            for(ReplaceNodeValues i=start;i!=null;i=i.next){
                System.out.println(i.data);
            }
            System.out.println();

            int oldval=50;
            int newval=500;
            start=start.replace(start, oldval, newval);
            System.out.println("After replacing the node :  ");
            for(ReplaceNodeValues i=start;i!=null;i=i.next){
                System.out.println(i.data);
            }
        }
    }