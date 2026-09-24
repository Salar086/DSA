public class UpdationOfArray {
    public static void main(String[] args){
        
        int [] arr = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Original array:");
        
        for(int num :arr){
            System.out.print(num + " ");
        }

        int indexposition= 3; // Position of the element to be updated (0-based index)
        
        int newElement = 100; // New value to be assigned

        arr[indexposition] = newElement; // Updating the element at the specified index

        // Printing the updated array
        
        System.out.println("Updated array:");
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    
}
