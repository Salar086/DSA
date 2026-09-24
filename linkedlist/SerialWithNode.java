class SerialWithNode {
    public int data;
    public SerialWithNode next;
    public SerialWithNode(int data) 
    {
        this.data=data;
    }
    public static void main(String[] args) {
    SerialWithNode start =  new SerialWithNode(10);
    SerialWithNode p= start;
   for (int i=2; i<=10; i++)
    {
    p.next = new SerialWithNode(i*10);
    p=p.next;}
   
    int serialno = 1;
    
    for (SerialWithNode i=start; i!=null; i=i.next){
        System.out.println(serialno+". "+i.data);
        serialno++;
       
    }
}
    
}   