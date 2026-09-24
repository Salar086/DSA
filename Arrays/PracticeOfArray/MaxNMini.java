package PracticeOfArray;

public class MaxNMini {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Initialize an array with some values
        int max = arr[0]; // Assume the first element is the maximum
        int min = arr[0]; // Assume the first element is the minimum

       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
       }
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }
}
