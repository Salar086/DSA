public class FindRowWithMaxSum {

     public static void main(String[] args) {
        int[][] arr ={{3,4,6,8},{2,4,8,2},{9,6,5,3}};
     
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
                sum+=arr[i][j];
            }
            System.out.println();
            maxsum= Math.max(maxsum,sum);
        }
        System.out.println(maxsum);

    }
}
