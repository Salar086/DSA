public class Oddsum {
      public static int printodd(int val){
        if(val<=0){
            return 0;
        }
        int sum = val + printodd(val - 2);
       return sum;
    }
    public static void main(String[] args) {
      System.out.println("SUM OF ODD NUMBERS ARE : "+ printodd(11));
    }
}
