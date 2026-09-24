public class Linkedlistprinting {
   int data;
   Linkedlistprinting next;
   Linkedlistprinting(int data){
    this.data=data;
   }
   Linkedlistprinting(int data,Linkedlistprinting next){
    this.data=data;
    this.next= next;
   }

   static void print(Linkedlistprinting current){
    if(current==null){
        return;
    }

    System.out.println(current.data);
    print(current.next);
   }

   public static void main(String[] args) {
    Linkedlistprinting start= new Linkedlistprinting(10);
    Linkedlistprinting p=start;
    for(int i=2;i<=10;i++){
        p.next = new Linkedlistprinting(i*10);
        p=p.next;
    }
    
   /*  System.out.println("---------------------- original linkedlist : ---------------------");
    for(Linkedlist i=start;i!=null;i=i.next){
        System.out.println(i.data);
    }*/

    print(start);
}
    }

