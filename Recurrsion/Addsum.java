public class Addsum {

    static int Sum(int value){
        if(value==1){
            return 1;
        }
        int sum = value + Sum(value - 1); // here we r calling method again.
        
        return sum;
    }
    public static void main(String[] args) {
    System.out.println("sum is : "+ Sum(5));    
    }
    
}
