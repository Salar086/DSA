public class AddNodeInStartInUnsortedArray {
    private int data;
    private AddNodeInStartInUnsortedArray next;
    
    public AddNodeInStartInUnsortedArray(int x) {
        this.data = x;
        this.next = null;
    }
    AddNodeInStartInUnsortedArray AddInStart(int x, AddNodeInStartInUnsortedArray start){
        AddNodeInStartInUnsortedArray newnode= new AddNodeInStartInUnsortedArray(x);
        newnode.next = start;
        return newnode;
    }

    public static void main(String[] args) {
        int[] arr ={45,92,43,82,122,67,54,32,56,32,667};
        AddNodeInStartInUnsortedArray start= null;
        AddNodeInStartInUnsortedArray p=null;
        
        for(int i=0;i<arr.length;i++){
            AddNodeInStartInUnsortedArray newnode = new AddNodeInStartInUnsortedArray(arr[i]);
            if(start==null){
                start=newnode;
                p=newnode;
            }
            else{
                p.next=newnode;
                p=p.next;
            }
        }
        System.out.println("original list");
        for(AddNodeInStartInUnsortedArray j=start;j!=null;j=j.next){
            System.out.println(j.data);
        }
        int x= 121;
        System.out.println("list after insertion in start");
        start=start.AddInStart(x,start);
        for(AddNodeInStartInUnsortedArray i=start;i!=null;i=i.next){
            System.out.println(i.data);
        }

    }
}
