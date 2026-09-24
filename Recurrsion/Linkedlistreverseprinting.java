public class Linkedlistreverseprinting {
    int data;
   Linkedlistreverseprinting next;
   Linkedlistreverseprinting(int data){
    this.data=data;
   }
   Linkedlistreverseprinting(int data,Linkedlistreverseprinting next){
    this.data=data;
    this.next= next;
   }

   static void print(Linkedlistreverseprinting current){
    if(current==null){
        return;
    }
      print(current.next);
    System.out.println(current.data);

   }

   public static void main(String[] args) {
    Linkedlistreverseprinting start= new Linkedlistreverseprinting(10);
    Linkedlistreverseprinting p=start;
    for(int i=2;i<=10;i++){
        p.next = new Linkedlistreverseprinting(i*10);
        p=p.next;
    }
    
   /*  System.out.println("---------------------- original linkedlist : ---------------------");
    for(Linkedlist i=start;i!=null;i=i.next){
        System.out.println(i.data);
    }*/

    print(start);
}
    }



