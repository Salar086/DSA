public class ArrayStack implements Stack {
    private int size;
    private Object a[];

    //Constructor
    ArrayStack(int capacity){
        a= new Object [capacity];
    }

    //isEmpty function which gives boolean value.
    public boolean IsEmpty(){
        if(size==0){
            return true ;
        }
        else {
            return false ;
        }
    }

    //Size Method .
    public int size(){
        return size ;
    }

    //Peak Method 
    public Object peak(){
        if(size==0) throw new IllegalStateException("Stack is empty");
        return a[size-1];
    }

    //Push Method
    public void push(Object obj){
        if(size==a.length){
            resize();
        }
        a[size]=obj;
        size++;
    }

    // Pop Method .
    public Object pop () {
        if(size==0) throw new IllegalStateException  ("Stack is empty");
        Object temp= a[size-1];
        a[size]=null;
        size--; 
        return temp;
    }

    // Resize Method .
    public void resize (){
        Object[] aa = a;
        a = new Object[2 * aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }

    // To Print All values of ArrayStack .
    public void print(){
        for (int i=0;i<size;i++){
        System.out.println(a[i]);
    }
    }

    // Reverse Print Method .
    public void reverseprint(){
        for(int i=size-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    // Bottom Value Method .
    public Object bottom () {
        if(size==0) throw new IllegalStateException("stack is empty");
        System.out.println( a[0]);
        return a[0];

    }

   // Minimum Value Method .
   public void minimumValue(){
    int min=(int)a[0];
    for(int i=1;i<size;i++){
        if((int)a[i]<min){
            min=(int)a[i];
        }
    }
    System.out.println(min);
   }

   // Mid Value of Stack.
   public void MidValue(){
    
    int mid= (size-1)/2;
    System.out.println("Mid Value of Array Stack is : " + a[mid]);
   }

   // Maximum Value Method .
   public void maximumValue(){
    int max=(int)a[0];
    for(int i=1;i<size;i++){
        if((int)a[i]>max){
            max=(int)a[i];
        }
    }
    System.out.println(max);
   }

   // Descending Order of ArrayStack .
    public void DescendingOrder(){
    for(int i=0;i<size-1;i++){
        for(int j=i+1;j<size;j++){
            if((int)a[i]<(int)a[j]){
                 Object temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
            }
        }
        
    }
    for(int k=0;k<size;k++){
        System.out.println(a[k]);
    }
    
    }
    
    // Ascending Order Of ArrayStack . 
    public void ascendingOrder(){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if((int )a[i] > (int)a[j]){
                    Object temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }
    }

    //ToString method/.
public String toString(){
    if(size==0){
        return ("stack is empty rn ");
    }
    StringBuffer bf= new StringBuffer();
    for(int i=0;i<size;i++){
        bf.append(a[i]+ " ");
    }
    return bf.toString();

}

//Equal method . 
public boolean equal(ArrayStack stack1,ArrayStack stack2){
    if(stack1.size!=stack2.size){
        return false ;
    }
    for(int i=0;i<stack1.size;i++){
        if(! stack1.a[i].equals(stack2.a[i])){
            return false;
        }
    }
    return true;
}

//Splitting Method .
public void split(){
    int size = this.size();
    int halfsize= size/2;

    ArrayStack splittedArrayStack = new ArrayStack(halfsize);

    for(int i=0; i< halfsize ; i++){
        Object val=this.pop();
        splittedArrayStack.push(val);
    }
    System.out.println(splittedArrayStack);
}





}