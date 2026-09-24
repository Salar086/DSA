public class PrintArray {
    static void printarray(int[] arr, int index){
        if(index==arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        printarray(arr, ++index); /*  we can use pre-increment [++index] Or [index +1] 
                                      not post-increment[index++] .  */

    }
    public static void main (String [] args ){
        int[] arr= {2,4,5,32,34,56,78,76,54,32};
        printarray(arr, 0);
    }

}
