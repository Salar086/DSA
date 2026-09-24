public class sumOf2DArray {
     public static void main(String[] args) {
        int[][] arr ={{3,4,6,8},{2,4,8,2},{9,6,5,3}};

        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
                sum+= arr[i][j];
            }
            System.out.println();
        }
        System.out.println("sum of 2darray is : "+ sum);

     }    
}
