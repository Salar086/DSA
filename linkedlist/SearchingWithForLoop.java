public class SearchingWithForLoop {
    int data;
    SearchingWithForLoop next;
    SearchingWithForLoop (int data){
         this.data= data;
    }
    
    SearchingWithForLoop (int data, SearchingWithForLoop next){
        this.data= data;
        this.next = next;
    }
    public boolean search(SearchingWithForLoop start,int x){
        for(SearchingWithForLoop i=start;i!=null;i=i.next){
            if (i.data==x){
                return true;
                
            }
           
        }
        return false ;
    }
    public static void main(String[] args) {
        SearchingWithForLoop start= new SearchingWithForLoop(10);
        SearchingWithForLoop p= start;
        for (int i=2;i<=10;i++){
            p.next = new SearchingWithForLoop (i*10);
            p=p.next;
        }
        System.out.println("original list ");
        for(SearchingWithForLoop j=start;j!=null;j=j.next){
            System.out.println(j.data);
        }

        int x=40;
        if(start.search(start,x)){
            System.out.println("value is in list");
        }
        else{
            System.out.println("value isn't in list ");
        }
    }


    
}
