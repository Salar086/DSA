import java.nio.channels.IllegalSelectorException;

public class LinkedQueue implements Queue{
    public static class Node{
        private Object data;
        Node prev= this;
        Node next = this ;

        Node(Object data){
            this.data = data;
        }
        Node(Object data,Node prev,Node next){
            this.data= data;
            this.next= next ;
            this.prev= prev;
        }
    }
    private int size;
    private Node head = new Node (null);
    
    //To Check The Size Of Your Queues .
    public int size(){
        return size;
    }

    //To Add Another Node In Your Queues .
    public void add(Object obj){
        ++size;
        head.prev.next = new Node(obj,head.prev,head);
        head.prev= head.prev.next;

    }

    //To Check The First Node In Your Queues .
    public Object first(){
        if (size ==0)throw new IllegalStateException("Queue is empty right now .");
        {
            return head.next.data;
        }
    }

    //To Remove AN Object From Your Queues .
    public Object remove (){
        if (size==0)throw new IllegalStateException(" Queue is empty right now ");
        
            --size;
            Object temp= head.next.data;
            head.next=head.next.next;
            head.next.prev=head;
            return temp;

        
    }

    //The Print Method For Both Credits And Debits .
    public void print(){
       Node p= head.next;
     while(p!=head){
        System.out.println(p.data);
        p=p.next;
       }

    }

    //To Make Your Object/Node As String And Print It Easily .
    public String toString(){
        if(size==0){ 
            return ("Queue is empty right now ");
        }
        StringBuffer bd= new StringBuffer();
        for (Node i=head.next; i!=head; i=i.next){
                bd.append(i.data + " ");
        }
            return bd.toString();

    }
    
    //To Check The Sum Of Both Credits And Debits Of Your Month .
    public static int sum(LinkedQueue Q1,LinkedQueue Q2){
        int sum=0;
        for(Node i= Q1.head.next ;i!=Q1.head;i=i.next){
            sum+= (Integer) i.data ;
        }
       for(Node j= Q2.head.next;j!=Q2.head;j=j.next){
        sum+=(Integer) j.data;
       }
   
       return sum;
    }

    //To Check The Profit And Lose Of Your Monthly Budget .
    public static void CheckLoseNdProfit(LinkedQueue Q1,LinkedQueue Q2){
        int sum1=0;
        for(Node  i=Q1.head.next;i!=Q1.head;i=i.next){
            sum1+=(Integer) i.data;
        }
        int sum2=0;
        for(Node i=Q2.head.next;i!=Q2.head;i=i.next){
            sum2+=(Integer)i.data;
        }
    int CheckProfitOrLost =sum1-sum2;
        if( CheckProfitOrLost>0){
            System.out.println("Congrats....This Month Your Saved Amount Is = " +  CheckProfitOrLost);
        }
        else{
            System.out.println("Oops....! This Month Your Lose Is = "+  CheckProfitOrLost);
        }
    }

    //ToArray (for n Elements from Rare/End ) .
   public Object [] toArrayFromRare(int n){
    if (head==null||n<=0){
        return new Object[0];  // Object[0] means return the Array of No Elements in it.It doesnot mean to return the value whic are at 0 index. 
    }
    if (n>size){
        throw new IllegalStateException("the value of 'N' is greater then the size of Queue");
    }
    Object[] arr = new Object[n];
    Node curr = head.prev;
    for(int i=0;i<n;i++){
        arr[i]=curr.data;
        curr = curr.prev;
    }
    return arr;
   }

   //To Check the Equality of Queue .
    public Boolean Equal(LinkedQueue Q1,LinkedQueue Q2){
    if(Q1.size()!=Q2.size()){
        return false;
    }
      Node  curr1=Q1.head.next;
      Node  curr2=Q2.head.next;
      while(curr1!=Q1.head ){
        if(!curr1.data.equals(curr2.data)){
            return false;
        }
        curr1=curr1.next;
        curr2=curr2.next;
     }
     return true;
     }
  
     //To Make A SubQueue which Is From Start To End .
     public Object[] SubQueueArray(Object start, Object end) {

    int count = 0;

    // First loop: count elements from start to end
    for (Node i = head.next; i != head; i = i.next) {

        if (i.data.equals(start)) {
            count++;

            for (Node j = i.next; j != head; j = j.next) {
                count++;

                if (j.data.equals(end)) {
                    break;
                }
            }

            break;
        }
    }

    // Make array
    Object[] SubQueueArray = new Object[count];

    int index = 0;

    // Second loop: copy elements from start to end
    for (Node i = head.next; i != head; i = i.next) {

        if (i.data.equals(start)) {

            for (Node j = i; j != head; j = j.next) {

                SubQueueArray[index] = j.data;
                index++;

                if (j.data.equals(end)) {
                    break;
                }
            }

            break;
        }
    }

    return SubQueueArray;
} // this bracket is for our method .

    } // this bracket is for our Class end .
    
