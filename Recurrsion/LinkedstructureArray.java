public class LinkedstructureArray {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next = next;
        }
        public static void Add(Node[]arr,int index,int data){
            Node newnode= new Node(data);
            if(arr[index]==null){
                arr[index]= newnode;
                return;
            }

            //start from first Node .
            Node current= arr[index];
            while(current.next != null){
                current= current.next;
            }
            current.next = newnode;
        }

        public static void printlist(Node current){
            if(current==null){
                return;
            }
            System.out.println(current.data);
            printlist(current.next);
        }

        public static void printarray(Node[]arr,int index){
            if(index==arr.length){
                return;
            }
            System.out.println("Index "+ index +":  ");
            
            printlist(arr[index]);
            
            System.out.println();

            printarray(arr, index+1 );
        }

        public static void main(String[] args) {
            Node[] arr = new Node[5];

            // index 0;
            Add(arr, 0 , 10);
              Add(arr, 0 , 20);
                Add(arr, 0 , 30);

                //Index 1;
                  Add(arr, 1 , 40);
                    Add(arr, 1 , 50);

                    //Index 2;
                      Add(arr, 2,60);
                        Add(arr, 2 , 70);
                          Add(arr, 2 , 80);
                            Add(arr, 2 , 90);

                        // index 3;
                          Add(arr, 3 , 100);
                            Add(arr, 3 , 110);
                              Add(arr, 3 , 120);

                              //index 4;
                                Add(arr, 4, 130);
                                  Add(arr, 4 , 140);
                                    Add(arr, 4 , 150);

            printarray(arr, 0);
        }
    }
}
