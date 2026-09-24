package PracticeOfArray;

public class updateArray {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*10;
        }
        System.out.println("Original array:");
        for(int num : arr){
            System.out.print(num + " ");
        }

        //update value of index 5;
        int indexposition = 5; // Position of the element to be updated (0-based index)
        int newElement = 100; // New value to be assigned
        arr[indexposition] = newElement; // Updating the element at the specified index
        System.out.println("\nArray after updating index 5:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
