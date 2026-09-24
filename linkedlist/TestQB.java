public class TestQB {
    int data;
    TestQB next;
    TestQB (int data){
        this.data = data;

    }
    TestQB (int data, TestQB next){
        this. data = data;
         this.next= next;
    }
    public static void main(String[] args) {
        TestQB start1= new TestQB(1);
        TestQB p= start1;
        p.next = new TestQB(2);
        p=p.next;
        p.next = new TestQB(3);
        p=p.next;
        p.next = new TestQB(4);
        p=p.next;
        p.next = new TestQB(5);
        p=p.next;

        TestQB start2= new TestQB(6);
        TestQB q = start2;
        q.next= new TestQB(7);
        q= q.next;
        q.next= new TestQB(8);
        q= q.next;
        q.next= new TestQB(9);
        q= q.next;
        q.next= new TestQB(10);
        q= q.next;

        int sum=0;
        int count =0;

    // traverse first list to calculate sum n count .

    p= start1;
    while(p !=null){
        sum = sum+p.data;
        count ++;
        p=p.next;

    }

    // traverse second list to calculate sum n count .
    q= start2;
    while (q!= null){
        sum= sum + q.data;
        count ++;
        q=q.next;
    }

    System.out.println(" sum of both lists are : " + sum);
    System.out.println();
    System.out.println(" average of both lists are : " + (double)(sum/count ) );

    }
}
