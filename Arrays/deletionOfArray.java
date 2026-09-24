public class deletionOfArray {
    public static void main(String[] args){
        int [] arr = {10, 20, 30, 40, 50, 60};
        
        int indexpos = 1; // Position of the element to be deleted (0-based index)
        
        // Print the original array before deletion
        System.out.println(" array before deletion:");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
        //steps for deletion of an element from the array
        int[] newArr = new int[arr.length - 1]; // Create a new array with one less space

        // Copy elements from the original array to the new array, skipping the element to be deleted
        
        int j = 0;
        for(int k = 0; k < arr.length; k++){
            if(k == indexpos){
                continue; // Skip the element at the specified index
            }
            newArr[j] = arr[k]; // Copy the element to the new array
            j++;
        }
        // Print the elements of the new array
        System.out.println(" array after deletion:");
        
        for(int num: newArr){
            System.out.print(num + " ");
        }
    }
}
