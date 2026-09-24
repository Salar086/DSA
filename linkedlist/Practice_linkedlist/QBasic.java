package Practice_linkedlist;

public class QBasic {
    private int data;
    private QBasic next;
    QBasic(int data){
        this.data=data;

    }
    QBasic(int data,QBasic next){
        this.data=data;
        this.next= next;

    }
    public static void main(String[] args) {
        QBasic node = new QBasic(10);
        QBasic head= node;
        for(int i=2;i<=5;i++){
            head.next= new QBasic(i*10);
            head=head.next;
        }
        for(QBasic i=node;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }

}
