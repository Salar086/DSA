package PracticeOfArray;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("reverse by Loop : ");
        int[] arr={10,20,30,40,50};


         System.out.println("original array : ");
        for(int num : arr){
            System.out.println(num);
        }
    /*     System.out.println("reversed by Loop : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    */

    // By Manually.
    int start =0;
    int end =arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
        start++;
        end--;
        
    }
    System.out.println("reversed : ");
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }


    
    }
}
