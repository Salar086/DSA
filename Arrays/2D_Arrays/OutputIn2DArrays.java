public class OutputIn2DArrays{
    public static void main(String[] args) {
        int[][] arr ={{3,4,6,8},{2,4,8,2},{9,6,5,3}};

        //printing of 2d arrays .
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+ " ");
               
            }
            System.out.println();
        }

    }
}