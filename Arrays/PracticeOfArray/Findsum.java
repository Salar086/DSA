package PracticeOfArray;

public class Findsum {
   
    public static void main(String[] args) {
 int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*10;
        }
        System.out.println("Elements of the array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("\nSum of the elements in the array: " + sum);
    }
}
