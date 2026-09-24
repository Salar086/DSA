package PracticeOfArray;

public class Occurance {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50, 10, 20, 10}; // Initialize an array with some values
        int elementToCount = 10; // Element to count occurrences of
        int count = 0; // Variable to keep track of occurrences
        for(int i=0; i<arr.length; i++){
            if(arr[i] == elementToCount){
                count++; // Increment count if the element matches
            }
        }
        System.out.println(count + " occurrences of " + elementToCount + " found in the array.");
    }
}
