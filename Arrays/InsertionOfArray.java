public class InsertionOfArray {
public static void main(String []args){
    int[] arr = {10,20,30,40,50,60};
    int element = 25; // Element to be inserted
    int indexpos = 2 ; // Position where the element will be inserted (0-based index

    // step 1: Create a new array with one extra space
    int newArr[] = new int[arr.length + 1]; // Create a new array with one extra space
    // step 2: Copy elements from the original array to the new array
    for(int i=0;i<indexpos;i++){
        newArr[i] = arr[i]; // Copy elements before the insertion position
    }
    // step 3: Insert the new element at the specified position
    newArr[indexpos] = element; // Insert the new element at the specified position

    // step 4: Copy the remaining elements from the original array to the new array 
    for(int i=indexpos;i<arr.length;i++){
        newArr[i+1]= arr[i];
    }
    // traversing the new array to copy the remaining elements
    for(int num: newArr){
        System.out.print(num + " "); // Print the elements of the new array
    }
}
}
