public class ArrayQueue implements Queue {
    public int size;
    public Object[] a;

    ArrayQueue(int capacity) {
        a = new Object[capacity];
        size = 0;
    }

    //Is Empty Method .
    public boolean IsEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    // Add Method .
    public void add(Object obj) {
        if (size == a.length) {
            throw new IllegalStateException("Queue is full");
        }
        a[size] = obj;
        size++;
    }

    @Override
    //Remove Method .
    public Object remove() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        Object temp = a[0];
        for (int i = 1; i < size; i++) {
            a[i - 1] = a[i];
        }
        a[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    //First Method which show the first value .
    public Object first() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return a[0];
    }

    @Override
    // Size Method which gives us the Size .
    public int size() {
        return size;
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
}
