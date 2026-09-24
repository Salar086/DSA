public class LinkedStack implements Stack {
    private int size;
    private Node top;

    // Size Method 
    public int size() {
        return size;
    }

    // Peak Method .
    public Object peak() {
        if (size == 0) {
            throw new IllegalStateException("stack is empty");
        }
        return top.data;
    }

    // Push Method .
    public void push(Object obj) {
        top = new Node(obj, top);
        ++size;
    }

    // Pop Method .
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("stack is empty");
        }
        Object temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    // To Print all Values of LinkedStack Method .
    public void print(){
      Node p=top;
      while(p !=null){
        System.out.println(p.data);
        p=p.next;
      }

    }

    // To Get Bottom Value of LinkedStack Method .
    public Object bottom(){
        if(size==0) throw new IllegalStateException("stack is empty");
        Node current =top;
        while(current.next!=null){
            current= current.next;
        }
        return current.data;
    }

    // Reverse Print Method # 1 .
    public void reverseprint(){
    reverseprint(top);
}
    // Reverse Print Method # 2 .
    void reverseprint(Node current){
        if(current ==null){
            return;
        }
        reverseprint(current.next);
        System.out.println(current.data);
    }

    // Minimum Value Method .
    public void minimumValue() {
        if (size == 0) {
            throw new IllegalStateException("stack is empty");
        }

        int minimum = (int) top.data;
        for (Node current = top; current != null; current = current.next) {
            if ((int) current.data < minimum) {
                minimum = (int) current.data;
            }
        }
        System.out.println(minimum);
    }

    // Maximum Value Method .
    public void maximumValue(){
        if(size==0) throw new IllegalStateException("stack is empty");
        int max = (int)top.data;
        for (Node i=top;i!=null;i =i.next){
            if((int)i.data>max){
                max=(int)i.data;
            }
        }
        System.out.println(max);
    }

    // Ascending Order Method .
    public void ascendingOrder() {

    for (Node current = top; current != null; current = current.next) {

        for (Node compare = current.next; compare != null; compare = compare.next) {

            if ((int)current.data > (int)compare.data) {

                Object temp = current.data;
                current.data = compare.data;
                compare.data = temp;
            }
        }
    }  //  outer loop ends HERE

    //  now print the entire sorted list
    for (Node i = top; i != null; i = i.next) {
        System.out.println(i.data);
    }
}

    // Descending Order Method .
     public void desscendingOrder() {

    for (Node head = top; head != null; head = head.next) {

        for (Node tail = head.next; tail != null;tail = tail.next) {

            if ((int)head.data < (int)tail.data) {

                Object temp = head.data;
                head.data = tail.data;
                tail.data = temp;
            }
        }
    }  //  outer loop ends HERE

    //  now print the entire sorted list
    for (Node k= top; k != null; k = k.next) {
        System.out.println(k.data);
    }
}

    //Mid Value of Linked Stack.
    public int  MidValue(){
        int count =0;
        for(Node i=top;i!=null;i=i.next){
            count++;
        }

        int mid = count/2;
        Node i=top; 
        
        for(int j=0;j<mid;j++){
            i=i.next;
        }  
        return (int)i.data;
    }

    //ToString Method .
    public String toString(){
        if(size==0){
            return ("Stack is empty");
        }
        StringBuffer bf= new StringBuffer();
        for(Node i=top;i!=null;i=i.next){
            bf.append(i.data + " ");
        }
        return bf.toString();
    }

    //Equal method.
    public boolean equal(LinkedStack list1,LinkedStack list2){
        if(list1.size!=list2.size){
            return false;
        }
        Node i= list1.top;
        Node j= list2.top;

        while (i!=null){
            if(!i.data.equals(j.data)){
                return false;
            }
           i=i.next;
           j=j.next;
        }
        return true;
    }

    //Split Linked stack in half nd then move that half stack into other stack .
    public  void splitstack(){
        int size= this.size();
        int halfsize = size/2;

        LinkedStack splittedstack = new LinkedStack();
        for (int i=0;i<=halfsize;i++){
            Object value= this.pop();
            splittedstack.push(value);
        }
        System.out.println(splittedstack);
    } 
 
    // Node Class .
    private static class Node {
        Object data;
        Node next;

        Node(Object obj, Node next) {
            this.data = obj;
            this.next = next;
        }
    }
}