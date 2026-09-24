package PracticeOfArray;

import java.util.Scanner;

public class inputValuesInArray {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Create an array of size 5
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value for index " + i + ": "); // Prompt user for input
            arr[i] = sc.nextInt(); // Read an integer from the user and store it in the array
        }
        // Printing the elements of the array
        System.out.println("Elements of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
