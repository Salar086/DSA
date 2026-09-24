public class EvenSum {
      public static int printevensum(int val){
        if(val<=0){
            return 0;
        }
        int sum = val + printevensum(val - 2);
       return sum;
    }
    public static void main(String[] args) {
      System.out.println("SUM OF EVEN NUMBERS ARE : "+ printevensum(12));
    }
}
