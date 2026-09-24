import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedQueue credits = new LinkedQueue();
        credits.add(1000);
        credits.add(300);
        credits.add(100);
        credits.add(200);
        credits.add(1500);
        credits.add(140);
        credits.add(190);
        credits.add(200);
        credits.add(500);
        credits.add(700);

        LinkedQueue debits = new LinkedQueue();
        debits.add(200);
        debits.add(500);
        debits.add(1000);
        debits.add(160);
        debits.add(250);
        debits.add(150);
        debits.add(650);
        debits.add(700);
        debits.add(100);
        debits.add(50);
       
        System.out.println("Credits Queue Values are : ");
        System.out.println(credits);
        System.out.println();
       
        System.out.println("Debits Queue Values are : ");
        System.out.println(debits);

        System.out.println();

        
        System.out.println("Sum of the two Queues are : "+ LinkedQueue.sum(credits, debits));
        System.out.println();

        LinkedQueue.CheckLoseNdProfit(credits,debits);

        System.out.println();
       Object[] arr1 =  credits.toArrayFromRare(3);
       System.out.println(Arrays.toString(arr1));
    
       System.out.println();
       System.out.println(credits.Equal(credits, debits));

       System.out.println();
       System.out.println(Arrays.toString(credits.SubQueueArray(300,500)));

       //-----------------------<-------------------------->---------------------------------.

       ArrayQueue arrayQueue1= new ArrayQueue(4);
        arrayQueue1.add(10);
        arrayQueue1.add(20);
        arrayQueue1.add(30);
        arrayQueue1.add(40);

        
        
        System.out.println();
        System.out.println(".................Array Queue Topic :.............. ");
        
         System.out.println();
        System.out.println(arrayQueue1.size());

        System.out.println();
        System.out.println(arrayQueue1.toString());

        System.out.println();
        System.out.println("First value of Array : " + arrayQueue1.first());
        
        
        arrayQueue1.remove();

        System.out.println();
        System.out.println("After removing the Array Will be : " + arrayQueue1.toString());
        }

    
}
