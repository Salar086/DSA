public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(100);
        arrayStack.push(20);
        arrayStack.push(43);
        arrayStack.push(40);
        arrayStack.push(15);
        arrayStack.push(52);

        ArrayStack arrayStack2 = new ArrayStack(5);
        arrayStack2.push(100);
        arrayStack2.push(20);
        arrayStack2.push(43);
        arrayStack2.push(40);
        arrayStack2.push(15);
        arrayStack2.push(52);



     System.out.println("........Array Stack...... ");
     arrayStack.print();

     System.out.println(".......Array Stack 2......");
    arrayStack2.print();

     System.out.println("splitted array stack which we created by splitting the arrayStack2 : ");
     arrayStack2.split();

    if(arrayStack.equal(arrayStack, arrayStack2))
    {
        System.out.println("both array stacks are equal . ");
    }
    else{
        System.out.println("both stacks r not equal . ");
    }
     arrayStack.MidValue();

    System.out.println("top value : " + arrayStack.peak());

    System.out.println("Array Stack's Size :  " + arrayStack.size());

    
    System.out.println("ArrayStacks bottom Value : ");
    arrayStack.bottom();

    System.out.println("reverse printing: ");
    arrayStack.reverseprint();
    
    System.out.println("ascending order of array stack :");
    arrayStack.ascendingOrder();
    
    System.out.println("descending order :");
    arrayStack.DescendingOrder();
    
    System.out.println("Minimum Value of Arraystack : ");
    arrayStack.minimumValue();

     System.out.println("Maximum Value of Arraystack : ");
    arrayStack.maximumValue();
    
    // structure of the linked stack

      LinkedStack linkedstack1 = new LinkedStack();
        linkedstack1.push(61);
        linkedstack1.push(10);
        linkedstack1.push(90);
        linkedstack1.push(60);
        linkedstack1.push(25);
        linkedstack1.push(50);
        linkedstack1.push(86);

        LinkedStack linkedstack2 = new LinkedStack();
        linkedstack2.push(61);
        linkedstack2.push(10);
        linkedstack2.push(90);
        linkedstack2.push(60);
        linkedstack2.push(25);
        linkedstack2.push(50);
        linkedstack2.push(86);


    System.out.println("........linked stack1....... ");
  
    linkedstack1.print();    

    System.out.println(".........linked Stack2.......");
    linkedstack2.print();

     System.out.println("The splittedstack which we created by linkedstack1 after splitting : ");
    linkedstack1.splitstack();

    if(linkedstack1.equal(linkedstack1, linkedstack2)){
        System.out.println("both stacks of linked list are equal. ");
    }
    else{
        System.out.println("both are not equal . ");
    }

    System.out.println("top value : "+ linkedstack1.peak());

    System.out.println("linkedstack's size : "+ linkedstack1.size());

    System.out.println("removed top element by using pop method : "+ linkedstack1.pop());
    
    System.out.println("linkedstack's size after pop : "+ linkedstack1.size());
    
    System.out.println("top value after using pop : "+ linkedstack1.peak());

    System.out.println("LinkedStack after poping an Element ");
     linkedstack1.print();

     System.out.println("The Mid Value of Linked Stack is : "+ linkedstack1.MidValue());


    // we used sout in this bcz return only give the value but don't print it . so we used sout.
    System.out.println("the bottom value of linkedstack is : "+linkedstack1.bottom());
    
    System.out.println("Reverse Printing in LinkedStack : ");
    linkedstack1.reverseprint();
    
    System.out.println("Ascending order of linkedstack ");
    linkedstack1.ascendingOrder();

    System.out.println(" descending order ");
    linkedstack1.desscendingOrder();
        
    System.out.println("minimum value of the linked stack is : ");
    linkedstack1.minimumValue();

     System.out.println("maximum value of the linked stack is : ");
    linkedstack1.maximumValue();

   
  
    }
    
}
