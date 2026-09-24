public class TestQC {
    int data;
    TestQC next;
    TestQC(int data){
        this.data= data;

    }
    TestQC(int data, TestQC next){
        this.data=data;
        this.next = next;
    }
    public static void   Secondlastval(TestQC start){
        TestQC p= start;
        while(p.next.next!=null){
            p=p.next;
        }
        System.out.println(p.data);
    }
    public static void main(String[] args) {
       
        // list one 
        TestQC start1=new TestQC(101);
        TestQC p= start1;
        p.next= new TestQC(202);
        p=p.next;
        p.next= new TestQC(303);
        p=p.next;
        p.next= new TestQC(405);
        p=p.next;

        //list two
        TestQC start2= new TestQC(405);
        TestQC q=start2;
        q.next= new TestQC(308);
        q=q.next;
         q.next= new TestQC(103);
        q=q.next;
         q.next= new TestQC(600);
        q=q.next;


        System.out.println("the sec last val of list one is : ");
        Secondlastval(start1);

        System.out.println(" the sec last val of list two is : ");
         Secondlastval(start2);


    }
}
