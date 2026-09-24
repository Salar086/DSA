public class StringLinearSearch {
    public static void main(String[] args){

        String[] arr= {"apple", "banana", "cherry", "date", "fig", "grape"};
        
        String elementToSearch= "fig"; // Element to search for
        
        boolean found = false; // Flag to indicate if the element is found
        
        for(int i=0;i<arr.length;i++){
        
            if(arr[i].equals(elementToSearch)){
                System.out.println("Element found at index: " + i);
                found = true; // Set the flag to true
                break; // Element found, exit the loop
            }
        
        }
        
        if(found==false){
        
            System.out.println("Element not found in the array.");  
        
        }
    }
    
}
