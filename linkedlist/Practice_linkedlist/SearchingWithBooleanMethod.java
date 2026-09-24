package Practice_linkedlist;

public class SearchingWithBooleanMethod {
    private int data;
    private SearchingWithBooleanMethod next;

    SearchingWithBooleanMethod(int data){
        this.data=data;
    }
    SearchingWithBooleanMethod(int data,SearchingWithBooleanMethod next){
        this.data=data;
        this.next=next;
    }
    public boolean search (SearchingWithBooleanMethod start,int x){
        for(SearchingWithBooleanMethod i=start;i!=null;i=i.next){
            if(i.data==x){
                return true;
            }
            
        }
        return false;
        }
        public static void main(String[] args) {
            SearchingWithBooleanMethod start= new SearchingWithBooleanMethod(10);
            SearchingWithBooleanMethod p=start;
            for(int i=2;i<=10;i++){
                p.next=new SearchingWithBooleanMethod(i*10);
                p=p.next;
            }

            System.out.println(" Original linkedlist ");
            for(SearchingWithBooleanMethod i=start;i!=null;i=i.next){
                System.out.println(i.data);
            }

            int x=400;
            if(start.search(start,x)){
                System.out.println("element is in the linkedlist");
            }
            else{
                System.out.println("Element is not in the list ");
            }
        }
    }

