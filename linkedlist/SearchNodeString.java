public class SearchNodeString {
    
    public String data;
    public SearchNodeString next;

    public SearchNodeString(String data) {
        this.data = data;
    }

    public SearchNodeString(String data, SearchNodeString next) {
        this.data = data;
        this.next = next;
    }

    // Search method to find a string in the linked list
    Boolean search(SearchNodeString start, String x){
        SearchNodeString current = start;
        while(current != null){
            if(current.data.equals(x)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchNodeString start = new SearchNodeString("ahmad");
        SearchNodeString p = start;
        p.next = new SearchNodeString("ahmer");
        p=p.next;
        p.next= new SearchNodeString("usaid");
        p= p.next;
        for(SearchNodeString i= start;i!=null;i=i.next){
            System.out.println(i.data);
        }
        String x = "ahmer";
        if(start.search(start, x)){
            System.out.println(x + " is found in the linked list.");
        } else {
            System.out.println(x + " is not found in the linked list.");
    }
    }
}
