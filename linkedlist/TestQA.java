public class TestQA {
     int data;
    TestQA next;
    TestQA (int data){
        this.data= data;

    }
    TestQA (int data, TestQA next){
        this.data=data;
        this.next = next;
    }
    public static void main(String[] args) {
        

        TestQA start1 = new TestQA (4);
        TestQA p= start1;
        p.next= new TestQA(8);
        p=p.next;
        p.next= new TestQA(12);
        p=p.next;
        p.next= new TestQA(16);
        p=p.next;

        TestQA start2 = new TestQA(6);
        TestQA q= start2;
        q.next= new TestQA(9);
        q=q.next;
        q.next= new TestQA(11);
        q=q.next;
        q.next= new TestQA(13);
        q=q.next;
        TestQA b= start2;
      
        for( p=start1;p!=null;p=p.next){
            System.out.println(p.data + " "+ b.data);
            b=b.next;

        }

    }
}
